package com.example.manage.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.common.utils.JsonUtil;
import com.example.dao.EntryCalendarMapper;
import com.example.manage.model.vo.EntryCalendarVo;
import com.example.manage.service.ManageService;
import com.example.model.EntryCalendar;
import com.example.report.handlers.ExcelHandler;
import com.example.report.handlers.impl.ExcelHandlerImpl;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;

/**
 * @author mahongyu
 * @date 2019/11/21 17:42
 */
@Service
@Slf4j
public class ManageServiceImpl implements ManageService {

  @Resource
  private EntryCalendarMapper entryCalendarMapper;

  @Override
  public EntryCalendar getById(Long id) {
    return entryCalendarMapper.selectByPrimaryKey(id);
  }

  @Override
  public void reportExport() throws Exception {
    EntryCalendar calendar1 = entryCalendarMapper.selectByPrimaryKey(108L);
    EntryCalendar calendar2 = entryCalendarMapper.selectByPrimaryKey(109L);
    System.out.println("calendar1:" + JSON.toJSONString(calendar1));
    System.out.println("calendar2:" + JSON.toJSONString(calendar2));

    ExcelHandler handler = new ExcelHandlerImpl();
    EntryCalendarVo vo1 = JsonUtil
        .toObject(JsonUtil.toJson(calendar1), EntryCalendarVo.class);
    System.out.println("vo1:" + JSON.toJSONString(vo1));

    EntryCalendarVo vo2 = JsonUtil
        .toObject(JsonUtil.toJson(calendar2), EntryCalendarVo.class);
    System.out.println("vo2:" + JSON.toJSONString(vo2));

    List<EntryCalendarVo> list = new ArrayList<>(5);
    list.add(vo1);
    list.add(vo2);

    Workbook wb = handler.exportXLSX("测试报表", true, true, list);
    //ByteArrayOutputStream outputStream = new ByteArrayOutputStream(1024 * 1024);
    FileOutputStream outputStream = new FileOutputStream(new File("D:\\output\\测试.xlsx"));
    wb.write(outputStream);
    outputStream.close();
    //ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
  }
}
