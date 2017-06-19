package com.example.admin.coolweather.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by admin on 2017/6/19.
 * 网络请求的帮助类
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
