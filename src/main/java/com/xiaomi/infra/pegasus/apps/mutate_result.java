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
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-08-02")
public class mutate_result implements org.apache.thrift.TBase<mutate_result, mutate_result._Fields>, java.io.Serializable, Cloneable, Comparable<mutate_result> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("mutate_result");

  private static final org.apache.thrift.protocol.TField ERROR_FIELD_DESC = new org.apache.thrift.protocol.TField("error", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CHECK_VALUE_RETURNED_FIELD_DESC = new org.apache.thrift.protocol.TField("check_value_returned", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField CHECK_VALUE_EXIST_FIELD_DESC = new org.apache.thrift.protocol.TField("check_value_exist", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField CHECK_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("check_value", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new mutate_resultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new mutate_resultTupleSchemeFactory();

  public int error; // required
  public boolean check_value_returned; // required
  public boolean check_value_exist; // required
  public com.xiaomi.infra.pegasus.base.blob check_value; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERROR((short)1, "error"),
    CHECK_VALUE_RETURNED((short)2, "check_value_returned"),
    CHECK_VALUE_EXIST((short)3, "check_value_exist"),
    CHECK_VALUE((short)4, "check_value");

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
        case 1: // ERROR
          return ERROR;
        case 2: // CHECK_VALUE_RETURNED
          return CHECK_VALUE_RETURNED;
        case 3: // CHECK_VALUE_EXIST
          return CHECK_VALUE_EXIST;
        case 4: // CHECK_VALUE
          return CHECK_VALUE;
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
  private static final int __ERROR_ISSET_ID = 0;
  private static final int __CHECK_VALUE_RETURNED_ISSET_ID = 1;
  private static final int __CHECK_VALUE_EXIST_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR, new org.apache.thrift.meta_data.FieldMetaData("error", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CHECK_VALUE_RETURNED, new org.apache.thrift.meta_data.FieldMetaData("check_value_returned", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.CHECK_VALUE_EXIST, new org.apache.thrift.meta_data.FieldMetaData("check_value_exist", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.CHECK_VALUE, new org.apache.thrift.meta_data.FieldMetaData("check_value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.xiaomi.infra.pegasus.base.blob.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(mutate_result.class, metaDataMap);
  }

  public mutate_result() {
  }

  public mutate_result(
    int error,
    boolean check_value_returned,
    boolean check_value_exist,
    com.xiaomi.infra.pegasus.base.blob check_value)
  {
    this();
    this.error = error;
    setErrorIsSet(true);
    this.check_value_returned = check_value_returned;
    setCheck_value_returnedIsSet(true);
    this.check_value_exist = check_value_exist;
    setCheck_value_existIsSet(true);
    this.check_value = check_value;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public mutate_result(mutate_result other) {
    __isset_bitfield = other.__isset_bitfield;
    this.error = other.error;
    this.check_value_returned = other.check_value_returned;
    this.check_value_exist = other.check_value_exist;
    if (other.isSetCheck_value()) {
      this.check_value = new com.xiaomi.infra.pegasus.base.blob(other.check_value);
    }
  }

  public mutate_result deepCopy() {
    return new mutate_result(this);
  }

  @Override
  public void clear() {
    setErrorIsSet(false);
    this.error = 0;
    setCheck_value_returnedIsSet(false);
    this.check_value_returned = false;
    setCheck_value_existIsSet(false);
    this.check_value_exist = false;
    this.check_value = null;
  }

  public int getError() {
    return this.error;
  }

  public mutate_result setError(int error) {
    this.error = error;
    setErrorIsSet(true);
    return this;
  }

  public void unsetError() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ERROR_ISSET_ID);
  }

  /** Returns true if field error is set (has been assigned a value) and false otherwise */
  public boolean isSetError() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ERROR_ISSET_ID);
  }

  public void setErrorIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ERROR_ISSET_ID, value);
  }

  public boolean isCheck_value_returned() {
    return this.check_value_returned;
  }

  public mutate_result setCheck_value_returned(boolean check_value_returned) {
    this.check_value_returned = check_value_returned;
    setCheck_value_returnedIsSet(true);
    return this;
  }

  public void unsetCheck_value_returned() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CHECK_VALUE_RETURNED_ISSET_ID);
  }

  /** Returns true if field check_value_returned is set (has been assigned a value) and false otherwise */
  public boolean isSetCheck_value_returned() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CHECK_VALUE_RETURNED_ISSET_ID);
  }

  public void setCheck_value_returnedIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CHECK_VALUE_RETURNED_ISSET_ID, value);
  }

  public boolean isCheck_value_exist() {
    return this.check_value_exist;
  }

  public mutate_result setCheck_value_exist(boolean check_value_exist) {
    this.check_value_exist = check_value_exist;
    setCheck_value_existIsSet(true);
    return this;
  }

  public void unsetCheck_value_exist() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CHECK_VALUE_EXIST_ISSET_ID);
  }

  /** Returns true if field check_value_exist is set (has been assigned a value) and false otherwise */
  public boolean isSetCheck_value_exist() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CHECK_VALUE_EXIST_ISSET_ID);
  }

  public void setCheck_value_existIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CHECK_VALUE_EXIST_ISSET_ID, value);
  }

  public com.xiaomi.infra.pegasus.base.blob getCheck_value() {
    return this.check_value;
  }

  public mutate_result setCheck_value(com.xiaomi.infra.pegasus.base.blob check_value) {
    this.check_value = check_value;
    return this;
  }

  public void unsetCheck_value() {
    this.check_value = null;
  }

  /** Returns true if field check_value is set (has been assigned a value) and false otherwise */
  public boolean isSetCheck_value() {
    return this.check_value != null;
  }

  public void setCheck_valueIsSet(boolean value) {
    if (!value) {
      this.check_value = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ERROR:
      if (value == null) {
        unsetError();
      } else {
        setError((java.lang.Integer)value);
      }
      break;

    case CHECK_VALUE_RETURNED:
      if (value == null) {
        unsetCheck_value_returned();
      } else {
        setCheck_value_returned((java.lang.Boolean)value);
      }
      break;

    case CHECK_VALUE_EXIST:
      if (value == null) {
        unsetCheck_value_exist();
      } else {
        setCheck_value_exist((java.lang.Boolean)value);
      }
      break;

    case CHECK_VALUE:
      if (value == null) {
        unsetCheck_value();
      } else {
        setCheck_value((com.xiaomi.infra.pegasus.base.blob)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR:
      return getError();

    case CHECK_VALUE_RETURNED:
      return isCheck_value_returned();

    case CHECK_VALUE_EXIST:
      return isCheck_value_exist();

    case CHECK_VALUE:
      return getCheck_value();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ERROR:
      return isSetError();
    case CHECK_VALUE_RETURNED:
      return isSetCheck_value_returned();
    case CHECK_VALUE_EXIST:
      return isSetCheck_value_exist();
    case CHECK_VALUE:
      return isSetCheck_value();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof mutate_result)
      return this.equals((mutate_result)that);
    return false;
  }

  public boolean equals(mutate_result that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_error = true;
    boolean that_present_error = true;
    if (this_present_error || that_present_error) {
      if (!(this_present_error && that_present_error))
        return false;
      if (this.error != that.error)
        return false;
    }

    boolean this_present_check_value_returned = true;
    boolean that_present_check_value_returned = true;
    if (this_present_check_value_returned || that_present_check_value_returned) {
      if (!(this_present_check_value_returned && that_present_check_value_returned))
        return false;
      if (this.check_value_returned != that.check_value_returned)
        return false;
    }

    boolean this_present_check_value_exist = true;
    boolean that_present_check_value_exist = true;
    if (this_present_check_value_exist || that_present_check_value_exist) {
      if (!(this_present_check_value_exist && that_present_check_value_exist))
        return false;
      if (this.check_value_exist != that.check_value_exist)
        return false;
    }

    boolean this_present_check_value = true && this.isSetCheck_value();
    boolean that_present_check_value = true && that.isSetCheck_value();
    if (this_present_check_value || that_present_check_value) {
      if (!(this_present_check_value && that_present_check_value))
        return false;
      if (!this.check_value.equals(that.check_value))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + error;

    hashCode = hashCode * 8191 + ((check_value_returned) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((check_value_exist) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetCheck_value()) ? 131071 : 524287);
    if (isSetCheck_value())
      hashCode = hashCode * 8191 + check_value.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(mutate_result other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetError()).compareTo(other.isSetError());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetError()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error, other.error);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCheck_value_returned()).compareTo(other.isSetCheck_value_returned());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCheck_value_returned()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.check_value_returned, other.check_value_returned);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCheck_value_exist()).compareTo(other.isSetCheck_value_exist());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCheck_value_exist()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.check_value_exist, other.check_value_exist);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCheck_value()).compareTo(other.isSetCheck_value());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCheck_value()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.check_value, other.check_value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("mutate_result(");
    boolean first = true;

    sb.append("error:");
    sb.append(this.error);
    first = false;
    if (!first) sb.append(", ");
    sb.append("check_value_returned:");
    sb.append(this.check_value_returned);
    first = false;
    if (!first) sb.append(", ");
    sb.append("check_value_exist:");
    sb.append(this.check_value_exist);
    first = false;
    if (!first) sb.append(", ");
    sb.append("check_value:");
    if (this.check_value == null) {
      sb.append("null");
    } else {
      sb.append(this.check_value);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (check_value != null) {
      check_value.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class mutate_resultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public mutate_resultStandardScheme getScheme() {
      return new mutate_resultStandardScheme();
    }
  }

  private static class mutate_resultStandardScheme extends org.apache.thrift.scheme.StandardScheme<mutate_result> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, mutate_result struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERROR
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.error = iprot.readI32();
              struct.setErrorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CHECK_VALUE_RETURNED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.check_value_returned = iprot.readBool();
              struct.setCheck_value_returnedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CHECK_VALUE_EXIST
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.check_value_exist = iprot.readBool();
              struct.setCheck_value_existIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CHECK_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.check_value = new com.xiaomi.infra.pegasus.base.blob();
              struct.check_value.read(iprot);
              struct.setCheck_valueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, mutate_result struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ERROR_FIELD_DESC);
      oprot.writeI32(struct.error);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CHECK_VALUE_RETURNED_FIELD_DESC);
      oprot.writeBool(struct.check_value_returned);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CHECK_VALUE_EXIST_FIELD_DESC);
      oprot.writeBool(struct.check_value_exist);
      oprot.writeFieldEnd();
      if (struct.check_value != null) {
        oprot.writeFieldBegin(CHECK_VALUE_FIELD_DESC);
        struct.check_value.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class mutate_resultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public mutate_resultTupleScheme getScheme() {
      return new mutate_resultTupleScheme();
    }
  }

  private static class mutate_resultTupleScheme extends org.apache.thrift.scheme.TupleScheme<mutate_result> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, mutate_result struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetError()) {
        optionals.set(0);
      }
      if (struct.isSetCheck_value_returned()) {
        optionals.set(1);
      }
      if (struct.isSetCheck_value_exist()) {
        optionals.set(2);
      }
      if (struct.isSetCheck_value()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetError()) {
        oprot.writeI32(struct.error);
      }
      if (struct.isSetCheck_value_returned()) {
        oprot.writeBool(struct.check_value_returned);
      }
      if (struct.isSetCheck_value_exist()) {
        oprot.writeBool(struct.check_value_exist);
      }
      if (struct.isSetCheck_value()) {
        struct.check_value.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, mutate_result struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.error = iprot.readI32();
        struct.setErrorIsSet(true);
      }
      if (incoming.get(1)) {
        struct.check_value_returned = iprot.readBool();
        struct.setCheck_value_returnedIsSet(true);
      }
      if (incoming.get(2)) {
        struct.check_value_exist = iprot.readBool();
        struct.setCheck_value_existIsSet(true);
      }
      if (incoming.get(3)) {
        struct.check_value = new com.xiaomi.infra.pegasus.base.blob();
        struct.check_value.read(iprot);
        struct.setCheck_valueIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

