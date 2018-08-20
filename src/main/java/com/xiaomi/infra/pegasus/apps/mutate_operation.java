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


public enum mutate_operation implements com.xiaomi.infra.pegasus.thrift.TEnum {
  MO_PUT(0),
  MO_DELETE(1);

  private final int value;

  private mutate_operation(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static mutate_operation findByValue(int value) { 
    switch (value) {
      case 0:
        return MO_PUT;
      case 1:
        return MO_DELETE;
      default:
        return null;
    }
  }
}