package com.github.timeselection.util;

import java.text.DecimalFormat;
import java.util.List;

/**
 * Describe:
 * Created Author: Gina
 * Created Date: 2017/6/15.
 */

public class TextUtil {
    private TextUtil() {
    }

    public static boolean isEmpty(String str) {
        if (str == null || "".equals(str) || "null".equalsIgnoreCase(str)) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ' && c != '\t' && c != '\r' && c != '\n') {
                return false;
            }
        }
        return true;
    }

    public static String filterNull(String str, String _default, String tail) {

        if (str == null || "".equals(str) || "null".equalsIgnoreCase(str)) {
            return _default;
        } else {
            if (tail != null) {
                str += tail;
            }
            return str;
        }
    }

    //重载
    public static String filterNull(String str, String _default) {
        return filterNull(str, _default, null);
    }

    //重载
    public static String filterNull(String str) {
        return filterNull(str, "", null);
    }

    //重载
    public static String filterNull(Float f, String _default, String tail) {
        String str = f + "";
        if (str == null || "".equals(str) || "null".equalsIgnoreCase(str)) {
            return _default;
        } else {
            if (tail != null) {
                str += tail;
            }
            return str;
        }
    }

    /**
     * 保留2位小数
     *
     * @return
     */
    public String fix(float f) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(f);
    }

    public static String parseNumToString(int num) {
        switch (num) {
            case 0:
                return "A";
            case 1:
                return "B";
            case 2:
                return "C";
            case 3:
                return "D";
            case 4:
                return "E";
            case 5:
                return "F";
            default:
                return "A";
        }
    }

    public static boolean isListEmpty(List list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }


}
