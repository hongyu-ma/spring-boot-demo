package com.example.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * JSON格式转换工具类.
 *
 * @author mahongyu
 * @date 2019/11/26 10:38
 */
@Slf4j
public class JsonUtil {

  /**
   * json转对象.
   *
   * @param json json字符串
   * @param clazz 对象
   * @return T
   * @version 1.0
   */
  public static <T> T toObject(String json, Class<T> clazz) {
    try {
      return JSON.parseObject(json, clazz);
    } catch (Exception e) {
      log.error("转换JSON异常", e);
      return null;
    }
  }

  /**
   * json转list对象.
   *
   * @param json json字符串
   * @param clazz 对象
   * @return list
   */
  public static <T> List<T> toArray(String json, Class<T> clazz) {
    try {
      return JSON.parseArray(json, clazz);
    } catch (Exception e) {
      log.error("转换JSON异常", e);
      return null;
    }
  }

  /**
   * 对象转json字符串.
   *
   * @param o 对象
   * @return json 字符串
   */
  public static String toJson(Object o) {
    try {
      return JSON.toJSONStringWithDateFormat(
          o, JSON.DEFFAULT_DATE_FORMAT, SerializerFeature.DisableCircularReferenceDetect);
    } catch (Exception e) {
      log.error("转换JSON异常", e);
      return null;
    }
  }
}
