package com.luyh.stickynavlayout;

import android.util.Log;

/**
 * Created by luyh on 2016/3/16.
 */
public class L {

    private static boolean ISDEBUG = true;

    private static String TAG = "asdfasdf";

    public static void i(String content){
        if(ISDEBUG) {
            Log.i(TAG, content);
        }
    }

}
