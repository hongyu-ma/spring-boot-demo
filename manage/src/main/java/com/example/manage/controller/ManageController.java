package com.example.manage.controller;

import com.example.common.utils.DateUtil;
import com.example.common.utils.JsonUtil;
import com.example.common.utils.VoUtil;
import com.example.manage.model.vo.EntryCalendarVo;
import com.example.model.EntryCalendar;
import com.example.manage.service.ManageService;
import com.example.model.vo.JsonVo;
import com.sun.org.apache.xpath.internal.SourceTree;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;
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
    /**测试持久层连接*/
    EntryCalendar ele = manageService.getById(108L);
    return ele;
  }

  @RequestMapping("/json")
  public JsonVo jsonTransfer() {
    /**测试jsonUtil工具包*/
    String str = "{\"originSys\":2,\"visitorType\":1,\"sendTimeMillis\":1573113868103,\"bespeakCode\":\"353100\",\"userErp\":\"qwerty\",\"visitTime\":\"2019-11-07\",\"visitorMobile\":\"18810583718\",\"workplaceID\":1}";
    JsonVo vo = JsonUtil.toObject(str, JsonVo.class);
    return vo;
  }

  @RequestMapping("/date")
  public String dateTransfer() throws ParseException {
    /**测试dateUtil工具包*/
    String StartDate = "2019-10-18 06:00:01";
    String endDate = "2019-11-18 06:00:01";
    List<Date> dates = DateUtil.findBetweenDays(DateUtil.dateByDayTimeFormat(StartDate),
        DateUtil.dateByDayTimeFormat(endDate));
    dates.stream().forEach(System.out::println);

    return "success";
  }

  @RequestMapping("/vo")
  public EntryCalendarVo voTranfer() {
    /**测试VoUtil工具包*/
    EntryCalendar ele = manageService.getById(108L);

    System.out.println(DateUtil.dayFormat(ele.getDate()));
    return VoUtil.convert(ele, EntryCalendarVo.class);
  }

}
