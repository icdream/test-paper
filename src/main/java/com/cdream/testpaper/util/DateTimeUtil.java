package com.cdream.testpaper.util;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/**
 * 时间转换工具类
 *
 * @author cdream
 * @date 2018/9/18
 */
public class DateTimeUtil {
    public static  final String STANDARD_FORMAT="yyyy-MM-dd HH:mm:ss";
    /**
     * 字符串转指定格式的日期
     * @param dateTimeString
     * @param format
     * @return
     */
    public static Date stringToDate(String dateTimeString, String format) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(format);
        DateTime dateTime = dateTimeFormatter.parseDateTime(dateTimeString);
        return dateTime.toDate();
    }

    /**
     * 将日期转为指定格式字符串
     * @param date
     * @param format
     * @return
     */
    public static String dateToString(Date date, String format) {
        if (date == null) {
            return StringUtils.EMPTY;
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(format);
    }
    public static Date stringToDate(String dateTimeString) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(STANDARD_FORMAT);
        DateTime dateTime = dateTimeFormatter.parseDateTime(dateTimeString);
        return dateTime.toDate();
    }
    public static String dateToString(Date date) {
        if (date == null) {
            return StringUtils.EMPTY;
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(STANDARD_FORMAT);
    }

}
