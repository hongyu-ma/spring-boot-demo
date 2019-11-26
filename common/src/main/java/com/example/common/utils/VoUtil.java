package com.example.common.utils;

import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * Vo 转换
 *
 * @author mahongyu
 * @date 2019/11/26 16:46
 */
public class VoUtil {

  /**
   * 对象互相转换
   */
  public static <T> T convert(Object object, Class<T> clazz) {
    //调用jsonUtil
    // return toObject(toJson(obj), clazz);
    String str = JSON.toJSONStringWithDateFormat(object, JSON.DEFFAULT_DATE_FORMAT);
    T t = JSON.parseObject(str, clazz);
    return t;
  }

  /**
   * List对象互相转换
   */
  public static <T> List<T> convertList(Object object, Class<T> clazz) {
    //调用jsonUtil
    //return toArray(toJson(obj), clazz);
    String str = JSON.toJSONStringWithDateFormat(object, JSON.DEFFAULT_DATE_FORMAT);
    List<T> list = JSON.parseArray(str, clazz);
    return list;
  }
}
