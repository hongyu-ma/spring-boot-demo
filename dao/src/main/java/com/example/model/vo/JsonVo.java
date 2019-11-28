package com.example.model.vo;

import lombok.Data;

/**
 * @author mahongyu
 * @date 2019/11/26 10:33
 */
@Data
public class JsonVo {

  private Integer originSys;
  private String userErp;
  private String visitorMobile;
  private String visitTime;
  private Integer workplaceID;
  private String bespeakCode;
  private Integer visitorType;
  private Long sendTimeMillis;
}
