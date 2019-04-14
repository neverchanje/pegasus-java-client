// Copyright (c) 2017, Xiaomi, Inc.  All rights reserved.
// This source code is licensed under the Apache License Version 2.0, which
// can be found in the LICENSE file in the root directory of this source tree.
/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.pegasus.apps;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-03-19")
public class update_request implements com.xiaomi.infra.pegasus.thrift.TBase<update_request, update_request._Fields>, java.io.Serializable, Cloneable, Comparable<update_request> {
  private static final com.xiaomi.infra.pegasus.thrift.protocol.TStruct STRUCT_DESC = new com.xiaomi.infra.pegasus.thrift.protocol.TStruct("update_request");

  private static final com.xiaomi.infra.pegasus.thrift.protocol.TField KEY_FIELD_DESC = new com.xiaomi.infra.pegasus.thrift.protocol.TField("key", com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT, (short)1);
  private static final com.xiaomi.infra.pegasus.thrift.protocol.TField VALUE_FIELD_DESC = new com.xiaomi.infra.pegasus.thrift.protocol.TField("value", com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT, (short)2);
  private static final com.xiaomi.infra.pegasus.thrift.protocol.TField EXPIRE_TS_SECONDS_FIELD_DESC = new com.xiaomi.infra.pegasus.thrift.protocol.TField("expire_ts_seconds", com.xiaomi.infra.pegasus.thrift.protocol.TType.I32, (short)3);

  private static final com.xiaomi.infra.pegasus.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new update_requestStandardSchemeFactory();
  private static final com.xiaomi.infra.pegasus.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new update_requestTupleSchemeFactory();

  public com.xiaomi.infra.pegasus.base.blob key; // required
  public com.xiaomi.infra.pegasus.base.blob value; // required
  public int expire_ts_seconds; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements com.xiaomi.infra.pegasus.thrift.TFieldIdEnum {
    KEY((short)1, "key"),
    VALUE((short)2, "value"),
    EXPIRE_TS_SECONDS((short)3, "expire_ts_seconds");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // KEY
          return KEY;
        case 2: // VALUE
          return VALUE;
        case 3: // EXPIRE_TS_SECONDS
          return EXPIRE_TS_SECONDS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __EXPIRE_TS_SECONDS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEY, new com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData("key", com.xiaomi.infra.pegasus.thrift.TFieldRequirementType.DEFAULT, 
        new com.xiaomi.infra.pegasus.thrift.meta_data.StructMetaData(com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT, com.xiaomi.infra.pegasus.base.blob.class)));
    tmpMap.put(_Fields.VALUE, new com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData("value", com.xiaomi.infra.pegasus.thrift.TFieldRequirementType.DEFAULT, 
        new com.xiaomi.infra.pegasus.thrift.meta_data.StructMetaData(com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT, com.xiaomi.infra.pegasus.base.blob.class)));
    tmpMap.put(_Fields.EXPIRE_TS_SECONDS, new com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData("expire_ts_seconds", com.xiaomi.infra.pegasus.thrift.TFieldRequirementType.DEFAULT, 
        new com.xiaomi.infra.pegasus.thrift.meta_data.FieldValueMetaData(com.xiaomi.infra.pegasus.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData.addStructMetaDataMap(update_request.class, metaDataMap);
  }

  public update_request() {
  }

  public update_request(
    com.xiaomi.infra.pegasus.base.blob key,
    com.xiaomi.infra.pegasus.base.blob value,
    int expire_ts_seconds)
  {
    this();
    this.key = key;
    this.value = value;
    this.expire_ts_seconds = expire_ts_seconds;
    setExpire_ts_secondsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public update_request(update_request other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetKey()) {
      this.key = new com.xiaomi.infra.pegasus.base.blob(other.key);
    }
    if (other.isSetValue()) {
      this.value = new com.xiaomi.infra.pegasus.base.blob(other.value);
    }
    this.expire_ts_seconds = other.expire_ts_seconds;
  }

  public update_request deepCopy() {
    return new update_request(this);
  }

  @Override
  public void clear() {
    this.key = null;
    this.value = null;
    setExpire_ts_secondsIsSet(false);
    this.expire_ts_seconds = 0;
  }

  public com.xiaomi.infra.pegasus.base.blob getKey() {
    return this.key;
  }

  public update_request setKey(com.xiaomi.infra.pegasus.base.blob key) {
    this.key = key;
    return this;
  }

  public void unsetKey() {
    this.key = null;
  }

  /** Returns true if field key is set (has been assigned a value) and false otherwise */
  public boolean isSetKey() {
    return this.key != null;
  }

  public void setKeyIsSet(boolean value) {
    if (!value) {
      this.key = null;
    }
  }

  public com.xiaomi.infra.pegasus.base.blob getValue() {
    return this.value;
  }

  public update_request setValue(com.xiaomi.infra.pegasus.base.blob value) {
    this.value = value;
    return this;
  }

  public void unsetValue() {
    this.value = null;
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  public int getExpire_ts_seconds() {
    return this.expire_ts_seconds;
  }

  public update_request setExpire_ts_seconds(int expire_ts_seconds) {
    this.expire_ts_seconds = expire_ts_seconds;
    setExpire_ts_secondsIsSet(true);
    return this;
  }

  public void unsetExpire_ts_seconds() {
    __isset_bitfield = com.xiaomi.infra.pegasus.thrift.EncodingUtils.clearBit(__isset_bitfield, __EXPIRE_TS_SECONDS_ISSET_ID);
  }

  /** Returns true if field expire_ts_seconds is set (has been assigned a value) and false otherwise */
  public boolean isSetExpire_ts_seconds() {
    return com.xiaomi.infra.pegasus.thrift.EncodingUtils.testBit(__isset_bitfield, __EXPIRE_TS_SECONDS_ISSET_ID);
  }

  public void setExpire_ts_secondsIsSet(boolean value) {
    __isset_bitfield = com.xiaomi.infra.pegasus.thrift.EncodingUtils.setBit(__isset_bitfield, __EXPIRE_TS_SECONDS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case KEY:
      if (value == null) {
        unsetKey();
      } else {
        setKey((com.xiaomi.infra.pegasus.base.blob)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((com.xiaomi.infra.pegasus.base.blob)value);
      }
      break;

    case EXPIRE_TS_SECONDS:
      if (value == null) {
        unsetExpire_ts_seconds();
      } else {
        setExpire_ts_seconds((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case KEY:
      return getKey();

    case VALUE:
      return getValue();

    case EXPIRE_TS_SECONDS:
      return getExpire_ts_seconds();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case KEY:
      return isSetKey();
    case VALUE:
      return isSetValue();
    case EXPIRE_TS_SECONDS:
      return isSetExpire_ts_seconds();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof update_request)
      return this.equals((update_request)that);
    return false;
  }

  public boolean equals(update_request that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_key = true && this.isSetKey();
    boolean that_present_key = true && that.isSetKey();
    if (this_present_key || that_present_key) {
      if (!(this_present_key && that_present_key))
        return false;
      if (!this.key.equals(that.key))
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
        return false;
    }

    boolean this_present_expire_ts_seconds = true;
    boolean that_present_expire_ts_seconds = true;
    if (this_present_expire_ts_seconds || that_present_expire_ts_seconds) {
      if (!(this_present_expire_ts_seconds && that_present_expire_ts_seconds))
        return false;
      if (this.expire_ts_seconds != that.expire_ts_seconds)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetKey()) ? 131071 : 524287);
    if (isSetKey())
      hashCode = hashCode * 8191 + key.hashCode();

    hashCode = hashCode * 8191 + ((isSetValue()) ? 131071 : 524287);
    if (isSetValue())
      hashCode = hashCode * 8191 + value.hashCode();

    hashCode = hashCode * 8191 + expire_ts_seconds;

    return hashCode;
  }

  @Override
  public int compareTo(update_request other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetKey()).compareTo(other.isSetKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKey()) {
      lastComparison = com.xiaomi.infra.pegasus.thrift.TBaseHelper.compareTo(this.key, other.key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = com.xiaomi.infra.pegasus.thrift.TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetExpire_ts_seconds()).compareTo(other.isSetExpire_ts_seconds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpire_ts_seconds()) {
      lastComparison = com.xiaomi.infra.pegasus.thrift.TBaseHelper.compareTo(this.expire_ts_seconds, other.expire_ts_seconds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol iprot) throws com.xiaomi.infra.pegasus.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol oprot) throws com.xiaomi.infra.pegasus.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("update_request(");
    boolean first = true;

    sb.append("key:");
    if (this.key == null) {
      sb.append("null");
    } else {
      sb.append(this.key);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("value:");
    if (this.value == null) {
      sb.append("null");
    } else {
      sb.append(this.value);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("expire_ts_seconds:");
    sb.append(this.expire_ts_seconds);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws com.xiaomi.infra.pegasus.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (key != null) {
      key.validate();
    }
    if (value != null) {
      value.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new com.xiaomi.infra.pegasus.thrift.protocol.TCompactProtocol(new com.xiaomi.infra.pegasus.thrift.transport.TIOStreamTransport(out)));
    } catch (com.xiaomi.infra.pegasus.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new com.xiaomi.infra.pegasus.thrift.protocol.TCompactProtocol(new com.xiaomi.infra.pegasus.thrift.transport.TIOStreamTransport(in)));
    } catch (com.xiaomi.infra.pegasus.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class update_requestStandardSchemeFactory implements com.xiaomi.infra.pegasus.thrift.scheme.SchemeFactory {
    public update_requestStandardScheme getScheme() {
      return new update_requestStandardScheme();
    }
  }

  private static class update_requestStandardScheme extends com.xiaomi.infra.pegasus.thrift.scheme.StandardScheme<update_request> {

    public void read(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol iprot, update_request struct) throws com.xiaomi.infra.pegasus.thrift.TException {
      com.xiaomi.infra.pegasus.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == com.xiaomi.infra.pegasus.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // KEY
            if (schemeField.type == com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT) {
              struct.key = new com.xiaomi.infra.pegasus.base.blob();
              struct.key.read(iprot);
              struct.setKeyIsSet(true);
            } else { 
              com.xiaomi.infra.pegasus.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VALUE
            if (schemeField.type == com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT) {
              struct.value = new com.xiaomi.infra.pegasus.base.blob();
              struct.value.read(iprot);
              struct.setValueIsSet(true);
            } else { 
              com.xiaomi.infra.pegasus.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXPIRE_TS_SECONDS
            if (schemeField.type == com.xiaomi.infra.pegasus.thrift.protocol.TType.I32) {
              struct.expire_ts_seconds = iprot.readI32();
              struct.setExpire_ts_secondsIsSet(true);
            } else { 
              com.xiaomi.infra.pegasus.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            com.xiaomi.infra.pegasus.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol oprot, update_request struct) throws com.xiaomi.infra.pegasus.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.key != null) {
        oprot.writeFieldBegin(KEY_FIELD_DESC);
        struct.key.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.value != null) {
        oprot.writeFieldBegin(VALUE_FIELD_DESC);
        struct.value.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(EXPIRE_TS_SECONDS_FIELD_DESC);
      oprot.writeI32(struct.expire_ts_seconds);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class update_requestTupleSchemeFactory implements com.xiaomi.infra.pegasus.thrift.scheme.SchemeFactory {
    public update_requestTupleScheme getScheme() {
      return new update_requestTupleScheme();
    }
  }

  private static class update_requestTupleScheme extends com.xiaomi.infra.pegasus.thrift.scheme.TupleScheme<update_request> {

    @Override
    public void write(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol prot, update_request struct) throws com.xiaomi.infra.pegasus.thrift.TException {
      com.xiaomi.infra.pegasus.thrift.protocol.TTupleProtocol oprot = (com.xiaomi.infra.pegasus.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetKey()) {
        optionals.set(0);
      }
      if (struct.isSetValue()) {
        optionals.set(1);
      }
      if (struct.isSetExpire_ts_seconds()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetKey()) {
        struct.key.write(oprot);
      }
      if (struct.isSetValue()) {
        struct.value.write(oprot);
      }
      if (struct.isSetExpire_ts_seconds()) {
        oprot.writeI32(struct.expire_ts_seconds);
      }
    }

    @Override
    public void read(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol prot, update_request struct) throws com.xiaomi.infra.pegasus.thrift.TException {
      com.xiaomi.infra.pegasus.thrift.protocol.TTupleProtocol iprot = (com.xiaomi.infra.pegasus.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.key = new com.xiaomi.infra.pegasus.base.blob();
        struct.key.read(iprot);
        struct.setKeyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.value = new com.xiaomi.infra.pegasus.base.blob();
        struct.value.read(iprot);
        struct.setValueIsSet(true);
      }
      if (incoming.get(2)) {
        struct.expire_ts_seconds = iprot.readI32();
        struct.setExpire_ts_secondsIsSet(true);
      }
    }
  }

  private static <S extends com.xiaomi.infra.pegasus.thrift.scheme.IScheme> S scheme(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol proto) {
    return (com.xiaomi.infra.pegasus.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

