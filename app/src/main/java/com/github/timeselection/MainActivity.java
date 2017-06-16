package com.github.timeselection;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.github.timeselection.view.TimeSelector;

public class MainActivity extends AppCompatActivity {
    TimeSelector timeSelector;
    TextView tv_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_msg = (TextView) findViewById(R.id.tv_msg);
//
        timeSelector = new TimeSelector(this, new TimeSelector.ResultHandler() {
            @Override
            public void handle(String time) {
                Log.d("test", "选择:" + time);
            }
        }, "1995-06-08 00:00", "2017-06-16 00:00", "2015-08-08 00:00");
        timeSelector.setMode(TimeSelector.MODE.YMDHM);//只显示 年月日

    }

    public void showDis(View view) {
        timeSelector.show();
    }
}
