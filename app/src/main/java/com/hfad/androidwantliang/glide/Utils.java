package com.hfad.androidwantliang.glide;

import android.content.Context;

/**
 * 作者:王亮 on 2019/6/19 0019 下午 5:14
 * QQ号:1401439953
 * 微信:wantliang
 * B站:香蕉玉米粥c
 * 微博:张洛希c
 * 作用:---
 */
public class Utils {
    //转换dip为px
    public static int dip2px(Context context, float dip) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int)(dip*scale + 0.5f*(dip>=0?1:-1));
    }

    //转换px为dip
    public static int px2dp(Context context, float px) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int)(px/scale + 0.5f*(px>=0?1:-1));
    }
}
