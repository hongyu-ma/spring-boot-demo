package com.example.dao;

import com.example.model.EntryCalendar;

public interface EntryCalendarMapper {

  int deleteByPrimaryKey(Long id);

  int insert(EntryCalendar record);

  int insertSelective(EntryCalendar record);

  EntryCalendar selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(EntryCalendar record);

  int updateByPrimaryKey(EntryCalendar record);
}