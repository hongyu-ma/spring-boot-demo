package com.example.manage.controller;

import com.example.model.EntryCalendar;
import com.example.manage.service.ManageService;
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
}
