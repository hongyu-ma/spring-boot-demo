package com.example.manage.model.vo;

import com.example.report.annotations.Header;
import java.util.Date;
import lombok.Data;

/**
 * @author mahongyu
 * @date 2019/11/26 16:59
 */
@Data
public class EntryCalendarVo {

  @Header("租户")
  private String tenantCode;
  @Header("code")
  private String entrySiteCode;
  @Header("日期")
  private Date date;
  @Header("总数")
  private Integer totalNumber;
  @Header("当前数")
  private Integer currentNumber;
}
