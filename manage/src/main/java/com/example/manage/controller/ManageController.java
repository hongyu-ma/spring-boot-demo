package com.example.manage.controller;

import com.example.common.utils.JsonUtil;
import com.example.model.EntryCalendar;
import com.example.manage.service.ManageService;
import com.example.model.vo.JsonVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 启动类控制器
 *
 * @author mahongyu
 * @date 2019/11/20 17:23
 */
@RestController
public class ManageController {

  @Autowired
  private ManageService manageService;

  @RequestMapping("/")
  public String HelloWorld() {
    return "hello world!";
  }

  @RequestMapping("/test")
  public EntryCalendar getElement() {
    /*测试持久层连接*/
    EntryCalendar ele = manageService.getById(108L);
    return ele;
  }

  @RequestMapping("/json")
  public JsonVo jsonTransfer() {
    String str = "{\"originSys\":2,\"visitorType\":1,\"sendTimeMillis\":1573113868103,\"bespeakCode\":\"353100\",\"userErp\":\"xiayanghui\",\"visitTime\":\"2019-11-07\",\"visitorMobile\":\"18810583718\",\"workplaceID\":1}";
    JsonVo vo = JsonUtil.toObject(str, JsonVo.class);
    return vo;
  }
}
