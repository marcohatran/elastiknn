- Remove the usage of Protobufs at the API level. Instead implemented a more idiomatic Elasticsearch API. Now using c
ustom case classes in scala and data classes in Python, which is more tedious, but worth it for a more intuitive API. 
- Remove the pipelines in favor of processing/indexing vectors in the custom mapping. The model parameters are defined in 
the mapping and applied to any document field with type `elastiknn_sparse_bool_vector` or `elastiknn_dense_float_vector`.
This eliminates the need for a pipeline/processor and the need to maintain custom mappings for the indexed vectors.
- Implement all queries using custom Lucene queries. This is tightly coupled to the custom mappings, since the mappings
determine how vector hashes are stored and can be queried. For now I've been able to use very simple Lucene Term and
Boolean queries.
- Add a "sparse indexed" mapping for jaccard and hamming similarities. This stores the indices of sparse boolean vectors 
as Lucene terms, allowing you to run a term query to get the intersection of the query vector against all stored vectors.  
---
- Removed the `num_tables` argument from `JaccardLshOptions` as it's redundant to `num_bands`.
- Profiled and refactored the `JaccardLshModel` using the Ann-benchmarks Kosarak Jaccard dataset.
- Added an example program that grid-searches JaccardLshOptions for best performance and plots the Pareto front.
---
- LSH hashes are stored as a single `text` field with a `whitespace` analyzer `boolean` similarity instead of storing each
hash as a single keyword field. This resolves the problem of having too many fields in a document, which was causing
exceptions when using a large-ish number of LSH tables and min-hash bands (e.g. 20 and 40). The `whitespace` analyzer is
necessary to prevent `too_many_clauses` warnings. You can technically increase the permitted number of fields in a 
document, but using a single `text` field is, IMHO, a less invasive solution to the user. With this change I'm able to 
run LSH queries on the ann-benchmarks Kosarak dataset with 20 tables and 40 bands without any exceptions or warnings. 
- Added a REST endpoint at `PUT /_elastiknn/prepare_mapping` which takes an index and a `ProcessorOptions` object and
uses them to set up a correct mapping for that index. Calling this endpoint is implemented as `prepareMapping` in the 
scala client and `prepare_mapping` in the python client.  
---
- Got rid of base64 encoding/decoding in ElastiKnnVectorFieldMapper. This improves ann-benchmarks performance by about 20%.
---
- Improved exact Jaccard performance by implementing a critical path in Java so that it uses primitive `int []` arrays instead of boxed integers in scala.
---
- Fixed performance regression.
---
- Client and core library interface improvements.
- Added use_cache parameter to KNearestNeighborsQuery which signals that the vectors should only be read once from Lucene and then cached in memory.
---
- Releasing versioned python client library to PyPi.
---
- Releasing versioned elastiknn plugin zip file.
---
