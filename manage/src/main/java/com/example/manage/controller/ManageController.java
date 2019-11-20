package com.example.manage.controller;

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

  @RequestMapping("/")
  public String HelloWorld() {
    return "hello world!";
  }

}
