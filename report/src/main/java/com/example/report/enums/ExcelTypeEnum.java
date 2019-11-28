package com.example.report.enums;

/**
 * @author mahongyu
 * @Description excel类型
 * @create 2019/4/1
 */
public enum ExcelTypeEnum {
  /**
   * excel类型
   */
  XLS("xls", "2003Excel表"),
  XLSX("xlsx", "2007Excel表");

  private String type;
  private String desc;

  ExcelTypeEnum(String type, String desc) {
    this.type = type;
    this.desc = desc;
  }

  public String getType() {
    return type;
  }

  public String getDesc() {
    return desc;
  }
}
