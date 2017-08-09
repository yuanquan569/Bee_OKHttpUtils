package com.forever.okhttputils;

import okhttp3.OkHttpClient;

/**
 * Created by 35292 on 2017/8/7 0007.
 */

public class OKHttpManager implements OKHttpInterface {

    private volatile static OKHttpManager instance_;
    private OkHttpClient okHttpClient;


    public static OKHttpManager getInstance_(){
        if(instance_ == null){
            synchronized (OKHttpManager.class){
                if(instance_ == null){
                    instance_ = new OKHttpManager();
                }
            }
        }
        return instance_;
    }

    public OKHttpManager(){
        if(okHttpClient == null){
            okHttpClient = new OkHttpClient();
        }else {
            okHttpClient = okHttpClient;
        }
    }


    @Override
    public void get(String url, CallBack callBack) {

        OKHttpRequest request = new GetRequest(url);
        request.execute(okHttpClient,callBack);
    }
}
