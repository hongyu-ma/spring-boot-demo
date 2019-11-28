package com.example.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 日期公共服务类
 *
 * @author mahongyu
 * @date 2019/11/26 15:25
 */
public class DateUtil {

  private static final String dayFormatStr = "yyyy-MM-dd";
  private static final String monthFormatStr = "yyyy-MM";
  private static final String dayTimeFormatStr = "yyyy-MM-dd HH:mm:ss";
  private static final String timeFormatStr = "HH:mm:ss";
  private static final String yearFormatStr = "yyyy";
  private static final String cycleFormatStr = "yyyyMM";
  /**
   * 半小时
   */
  public static final int HALF_HOURS_MINUTE = 30;

  /**
   * 日期转换为字符串
   *
   * @param date 日期
   * @param format 转换格式
   * @return string
   */
  public static String dateToStr(Date date, String format) {
    SimpleDateFormat sdf = new SimpleDateFormat(format);
    return sdf.format(date);
  }

  /**
   * 日期转换为字符串
   *
   * @param day 日期
   * @param format 转换格式
   * @return date
   */
  public static Date strToDate(String day, String format) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat(format);
    return sdf.parse(day);
  }

  public static String dayFormat(Date date) {
    return dateToStr(date, dayFormatStr);
  }

  public static String dayTimeFormat(Date date) {
    return dateToStr(date, dayTimeFormatStr);
  }

  public static String monthFormat(Date date) {
    return dateToStr(date, monthFormatStr);
  }

  public static String yearFormat(Date date) {
    return dateToStr(date, yearFormatStr);
  }

  public static Date dateByDayFormat(String day) throws ParseException {
    return strToDate(day, dayFormatStr);
  }

  public static Date dateByDayTimeFormat(String day) throws ParseException {
    return strToDate(day, dayTimeFormatStr);
  }

  public static Date dateByCycleFormat(String day) throws ParseException {
    return strToDate(day, cycleFormatStr);
  }

  /**
   * 获取上一年
   */
  public static String getLastYear() {
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.YEAR, -1);
    return yearFormat(calendar.getTime());
  }

  /**
   * 获取当前月份
   */
  public static String getCurrentMonth() {
    Calendar calendar = Calendar.getInstance();
    return monthFormat(calendar.getTime());
  }

  /**
   * 获取上个月
   */
  public static String getLastMonth() {
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.MONTH, -1);
    return monthFormat(calendar.getTime());
  }

  /**
   * 获取某一年的最后一天
   */
  public static Date getLastDayOfYear(int year) {
    Calendar calendar = Calendar.getInstance();
    calendar.clear();
    calendar.set(Calendar.YEAR, year);
    calendar.roll(Calendar.DAY_OF_YEAR, -1);
    Date currYearLast = calendar.getTime();

    return currYearLast;
  }

  /**
   * 获取今年的最后一天
   */
  public static Date getLastDayOfCurrentYear() {
    Calendar calendar = Calendar.getInstance();
    int currentYear = calendar.get(Calendar.YEAR);
    return getLastDayOfYear(currentYear);
  }

  /**
   * 获得前一天
   */
  public static String getYesterday(Date date) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.add(Calendar.DAY_OF_MONTH, -1);
    return dayFormat(calendar.getTime());
  }

  /**
   * 将分钟换算成小时, 不足半小时不计算
   */
  public static Float minuteToHour(int minute) {
    float hours = minute / 60;
    int emainder = minute % 60;
    if (emainder >= HALF_HOURS_MINUTE) {
      hours = hours + 0.5f;
    }
    return hours;
  }

  /**
   * 得到某个月的天数
   */
  public static int getDaysOfMonth(Date date) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);

    return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
  }

  /**
   * 获取周几
   */
  public static String getWeek(Date date) {
    String[] weeks = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    int week_index = cal.get(Calendar.DAY_OF_WEEK) - 1;
    if (week_index < 0) {
      week_index = 0;
    }
    return weeks[week_index];
  }

  /**
   * 获取两个时间段差值
   */
  public static long getDays(Date startDate, Date endDate) {
    return (endDate.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24);
  }

  /**
   * 计算两个日期之间相差的天数
   *
   * @param smdate 较小的时间
   * @param bdate 较大的时间
   * @return 相差天数
   */
  public static int daysBetween(Date smdate, Date bdate) {
    try {
      SimpleDateFormat sdf = new SimpleDateFormat(dayFormatStr);
      smdate = sdf.parse(sdf.format(smdate));
      bdate = sdf.parse(sdf.format(bdate));
      Calendar cal = Calendar.getInstance();
      cal.setTime(smdate);
      long time1 = cal.getTimeInMillis();
      cal.setTime(bdate);
      long time2 = cal.getTimeInMillis();
      long between_days = (time2 - time1) / (1000 * 3600 * 24);

      return Integer.parseInt(String.valueOf(between_days));
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return 0;
  }

  /**
   * 获取时间段的所有天
   */
  public static List<Date> findBetweenDays(Date begin, Date end) {
    List<Date> dayList = new ArrayList<>();
    try {
      Calendar cal = Calendar.getInstance();
      cal.setTime(begin);

      while (begin.getTime() <= end.getTime()) {
        dayList.add(cal.getTime());
        cal.add(Calendar.DAY_OF_YEAR, 1);
        begin = cal.getTime();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return dayList;
  }
}
