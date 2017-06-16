package com.github.timeselection.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * Describe:
 * Created Author: Gina
 * Created Date: 2017/6/15.
 */

public class TimeScreenUtil {
    public static int height;
    public static int width;
    private Context context;

    private static TimeScreenUtil instance;

    private TimeScreenUtil(Context context) {
        this.context = context;
        WindowManager manager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        manager.getDefaultDisplay().getMetrics(dm);
        width = dm.widthPixels;
        height = dm.heightPixels;
    }

    public static TimeScreenUtil getInstance(Context context) {
        if (instance == null) {
            instance = new TimeScreenUtil(context);
        }
        return instance;
    }


    /**
     * 得到手机屏幕的宽度, pix单位
     */
    public int getScreenWidth() {
        return width;
    }

}
