// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.klibisz.elastiknn

object ElastiknnProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    scalapb.options.ScalapbProto
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      com.klibisz.elastiknn.ProcessorOptions,
      com.klibisz.elastiknn.ExactModelOptions,
      com.klibisz.elastiknn.LshModelOptions,
      com.klibisz.elastiknn.ProcessedVector,
      com.klibisz.elastiknn.KNearestNeighborsQuery
    )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """Cg9lbGFzdGlrbm4ucHJvdG8SEWtsaWJpc3ouZWxhc3Rpa25uGhVzY2FsYXBiL3NjYWxhcGIucHJvdG8i+QIKEFByb2Nlc3Nvc
  k9wdGlvbnMSKgoJZmllbGRfcmF3GAEgASgJQg3iPwoSCGZpZWxkUmF3UghmaWVsZFJhdxI8Cg9maWVsZF9wcm9jZXNzZWQYAiABK
  AlCE+I/EBIOZmllbGRQcm9jZXNzZWRSDmZpZWxkUHJvY2Vzc2VkEjAKC2Rpc2NhcmRfcmF3GAMgASgIQg/iPwwSCmRpc2NhcmRSY
  XdSCmRpc2NhcmRSYXcSLAoJZGltZW5zaW9uGAQgASgFQg7iPwsSCWRpbWVuc2lvblIJZGltZW5zaW9uEkgKBWV4YWN0GAUgASgLM
  iQua2xpYmlzei5lbGFzdGlrbm4uRXhhY3RNb2RlbE9wdGlvbnNCCuI/BxIFZXhhY3RIAFIFZXhhY3QSQAoDbHNoGAYgASgLMiIua
  2xpYmlzei5lbGFzdGlrbm4uTHNoTW9kZWxPcHRpb25zQgjiPwUSA2xzaEgAUgNsc2hCDwoNbW9kZWxfb3B0aW9ucyITChFFeGFjd
  E1vZGVsT3B0aW9ucyKkAQoPTHNoTW9kZWxPcHRpb25zEh0KBHNlZWQYASABKANCCeI/BhIEc2VlZFIEc2VlZBJGCghkaXN0YW5jZ
  RgCIAEoDjIbLmtsaWJpc3ouZWxhc3Rpa25uLkRpc3RhbmNlQg3iPwoSCGRpc3RhbmNlUghkaXN0YW5jZRIUCgFrGAMgASgFQgbiP
  wMSAWtSAWsSFAoBTBgEIAEoBUIG4j8DEgFsUgFMIq0BCg9Qcm9jZXNzZWRWZWN0b3ISUgoFZXhhY3QYASABKAsyLi5rbGliaXN6L
  mVsYXN0aWtubi5Qcm9jZXNzZWRWZWN0b3IuRXhhY3RWZWN0b3JCCuI/BxIFZXhhY3RIAFIFZXhhY3QaOQoLRXhhY3RWZWN0b3ISK
  goGdmVjdG9yGAEgAygBQhLiPw8SBnZlY3RvchoFQXJyYXlSBnZlY3RvckILCglwcm9jZXNzZWQi2wYKFktOZWFyZXN0TmVpZ2hib
  3JzUXVlcnkSMAoLcGlwZWxpbmVfaWQYASABKAlCD+I/DBIKcGlwZWxpbmVJZFIKcGlwZWxpbmVJZBIzCgxwcm9jZXNzb3JfaWQYA
  iABKAlCEOI/DRILcHJvY2Vzc29ySWRSC3Byb2Nlc3NvcklkEhQKAWsYAyABKAVCBuI/AxIBa1IBaxJfCgVleGFjdBgEIAEoCzI7L
  mtsaWJpc3ouZWxhc3Rpa25uLktOZWFyZXN0TmVpZ2hib3JzUXVlcnkuRXhhY3RRdWVyeU9wdGlvbnNCCuI/BxIFZXhhY3RIAFIFZ
  XhhY3QSVwoDbHNoGAUgASgLMjkua2xpYmlzei5lbGFzdGlrbm4uS05lYXJlc3ROZWlnaGJvcnNRdWVyeS5Mc2hRdWVyeU9wdGlvb
  nNCCOI/BRIDbHNoSABSA2xzaBJeCgVnaXZlbhgGIAEoCzI6LmtsaWJpc3ouZWxhc3Rpa25uLktOZWFyZXN0TmVpZ2hib3JzUXVlc
  nkuR2l2ZW5RdWVyeVZlY3RvckIK4j8HEgVnaXZlbkgBUgVnaXZlbhJmCgdpbmRleGVkGAcgASgLMjwua2xpYmlzei5lbGFzdGlrb
  m4uS05lYXJlc3ROZWlnaGJvcnNRdWVyeS5JbmRleGVkUXVlcnlWZWN0b3JCDOI/CRIHaW5kZXhlZEgBUgdpbmRleGVkGlsKEUV4Y
  WN0UXVlcnlPcHRpb25zEkYKCGRpc3RhbmNlGAEgASgOMhsua2xpYmlzei5lbGFzdGlrbm4uRGlzdGFuY2VCDeI/ChIIZGlzdGFuY
  2VSCGRpc3RhbmNlGhEKD0xzaFF1ZXJ5T3B0aW9ucxo+ChBHaXZlblF1ZXJ5VmVjdG9yEioKBnZlY3RvchgBIAMoAUIS4j8PEgZ2Z
  WN0b3IaBUFycmF5UgZ2ZWN0b3IacQoSSW5kZXhlZFF1ZXJ5VmVjdG9yEiAKBWluZGV4GAEgASgJQgriPwcSBWluZGV4UgVpbmRle
  BIgCgVmaWVsZBgCIAEoCUIK4j8HEgVmaWVsZFIFZmllbGQSFwoCaWQYAyABKAlCB+I/BBICaWRSAmlkQg8KDXF1ZXJ5X29wdGlvb
  nNCDgoMcXVlcnlfdmVjdG9yKoQBCghEaXN0YW5jZRIUChBESVNUQU5DRV9JTlZBTElEEAASDwoLRElTVEFOQ0VfTDEQARIPCgtES
  VNUQU5DRV9MMhACEhQKEERJU1RBTkNFX0FOR1VMQVIQAxIUChBESVNUQU5DRV9IQU1NSU5HEAQSFAoQRElTVEFOQ0VfSkFDQ0FSR
  BAFQhcKFWNvbS5rbGliaXN6LmVsYXN0aWtubmIGcHJvdG8z"""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
      scalapb.options.ScalapbProto.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}