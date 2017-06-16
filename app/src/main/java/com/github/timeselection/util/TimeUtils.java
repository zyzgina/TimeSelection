package com.github.timeselection.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Describe:
 * Created Author: Gina
 * Created Date: 2017/6/15.
 */

public class TimeUtils {
    public static final String DEFAULT_TEMPLATE_DAY = "yyyy-MM-dd";
    public static final String DEFAULT_TEMPLATE = "yyyy-MM-dd HH:mm:ss";

    private TimeUtils() {
    }


    /**
     * -日期控件
     * * /
     * /**
     * 使用用户格式提取字符串日期
     *
     * @param strDate 日期字符串
     * @param pattern 日期格式
     * @return
     */

    public static Date parse(String strDate, String pattern) {

        if (TextUtil.isEmpty(strDate)) {
            return null;
        }
        try {
            SimpleDateFormat df = new SimpleDateFormat(pattern);
            return df.parse(strDate.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 使用用户格式格式化日期
     *
     * @param date    日期
     * @param pattern 日期格式
     * @return
     */

    public static String format(Date date, String pattern) {
        String returnValue = "";
        if (date != null) {
            SimpleDateFormat df = new SimpleDateFormat(pattern);
            returnValue = df.format(date);
        }
        return (returnValue);
    }

    /**
     * 时间
     *
     * @param strDate 日期
     * @param pattern 日期格式
     * @return
     */
    public static String formatYear(String strDate, String pattern) {
        return format(parse(strDate, pattern), "yyyy");
    }


}
