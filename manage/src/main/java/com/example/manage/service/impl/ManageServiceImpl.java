package com.example.manage.service.impl;

import com.example.dao.EntryCalendarMapper;
import com.example.model.EntryCalendar;
import com.example.manage.service.ManageService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author mahongyu
 * @date 2019/11/21 17:42
 */
@Service
public class ManageServiceImpl implements ManageService {

  @Resource
  private EntryCalendarMapper entryCalendarMapper;

  @Override
  public EntryCalendar getById(Long id) {
    return entryCalendarMapper.selectByPrimaryKey(id);
  }
}
