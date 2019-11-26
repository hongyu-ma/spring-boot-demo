package com.example.manage.model.vo;

import java.util.Date;
import lombok.Data;

/**
 * @author mahongyu
 * @date 2019/11/26 16:59
 */
@Data
public class EntryCalendarVo {

  private String tenantCode;

  private String entrySiteCode;

  private Date date;

  private Integer totalNumber;

  private Integer currentNumber;
}
