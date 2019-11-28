package com.example.report.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author yu
 * @Description 反射工具类
 * @date 2019/3/26 16:29
 * @since 1.0.0
 */
public class ReflectUtil {

  /**
   * 获取属性值
   *
   * @param methodName 字段get方法名称
   * @param t 数据vo
   */
  public static String getFieldValue(String methodName, Object t) {
    Class tCls = t.getClass();
    String fieldValue = "";
    try {
      Method getMethod = tCls.getMethod(methodName, new Class[]{});
      // 通过JavaBean对象拿到该属性的get方法，从而进行操控
      Object val = getMethod.invoke(t, new Object[]{});
      // 操控该对象属性的get方法，从而拿到属性值
      if (val != null) {
        fieldValue = String.valueOf(val);
      }
    } catch (SecurityException
        | InvocationTargetException
        | NoSuchMethodException
        | IllegalAccessException e) {
      e.printStackTrace();
    } catch (IllegalArgumentException e) {
      e.printStackTrace();
    }
    return fieldValue;
  }

  /**
   * 获取值
   */
  public static Object getObjectFieldValue(String methodName, Object t) {
    Class tCls = t.getClass();
    Object fieldValue = "";
    try {
      Method getMethod = tCls.getMethod(methodName, new Class[]{});
      // 通过JavaBean对象拿到该属性的get方法，从而进行操控
      Object val = getMethod.invoke(t, new Object[]{});
      // 操控该对象属性的get方法，从而拿到属性值
      if (val != null) {
        fieldValue = val;
      }
    } catch (SecurityException
        | InvocationTargetException
        | NoSuchMethodException
        | IllegalAccessException e) {
      e.printStackTrace();
    } catch (IllegalArgumentException e) {
      e.printStackTrace();
    }
    return fieldValue;
  }

  /**
   * 获取字段get方法名称
   */
  public static String getMethodName(Field field) {
    String first = field.getName().substring(0, 1);
    String other = field.getName().substring(1);

    return "get" + first.toUpperCase() + other;
  }
}
