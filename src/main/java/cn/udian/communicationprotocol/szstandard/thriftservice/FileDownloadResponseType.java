/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.udian.communicationprotocol.szstandard.thriftservice;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum FileDownloadResponseType implements org.apache.thrift.TEnum {
  SUCCESS(0),
  PROGRESS(1),
  FAIL_TIMEOUT(2),
  FAIL_LOGINFAIL(3),
  FAIL_FAILBYFAIL(4),
  FAIL_FILENOFOUND(5),
  FAIL_FILETOOLONG(6),
  FAIL_LATESTVERSION(7),
  FAIL_CHECKFAIL(8),
  FAIL_OTHER(9);

  private final int value;

  private FileDownloadResponseType(int value) {
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
  public static FileDownloadResponseType findByValue(int value) { 
    switch (value) {
      case 0:
        return SUCCESS;
      case 1:
        return PROGRESS;
      case 2:
        return FAIL_TIMEOUT;
      case 3:
        return FAIL_LOGINFAIL;
      case 4:
        return FAIL_FAILBYFAIL;
      case 5:
        return FAIL_FILENOFOUND;
      case 6:
        return FAIL_FILETOOLONG;
      case 7:
        return FAIL_LATESTVERSION;
      case 8:
        return FAIL_CHECKFAIL;
      case 9:
        return FAIL_OTHER;
      default:
        return null;
    }
  }
}