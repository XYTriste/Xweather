package com.xweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    /*
    * 该类用于与服务端进行交互
    * */

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){

        /*静态方法用于发起一个http请求,参数为一个url字符串
        * 以及一个Callback用于接收服务端返回的数据并进行处理
        * */

        OkHttpClient client = new OkHttpClient();                    //new一个客户端请求
        Request request = new Request.Builder().url(address).build(); //对请求进行封装
        client.newCall(request).enqueue(callback);                    //开始请求并注册回调
    }
}
