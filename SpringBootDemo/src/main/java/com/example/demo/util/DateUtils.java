package com.example.demo.util;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Author baiyun
 * @date 2020/10/16
 */
public class DateUtils {
    private static String DEFAULT_PATTERN = "yyyy-MM-dd";
    private static String FULL_PATTERN = "yyyy-MM-dd HH:mm:ss";

    public static String toDate(Date date){
        if(date == null){
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_PATTERN);
        return sdf.format(date);
    }
    public static String now(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(FULL_PATTERN);
        LocalDateTime now = LocalDateTime.now();
        String format = now.format(dateTimeFormatter);
        return format;
    }
}
