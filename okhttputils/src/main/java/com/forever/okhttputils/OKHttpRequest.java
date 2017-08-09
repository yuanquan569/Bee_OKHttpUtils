package com.forever.okhttputils;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by 35292 on 2017/7/22 0022.
 */

public abstract class OKHttpRequest {

    public abstract Request getRequest();

    Request.Builder generateBuild(String url){

        Request.Builder builder = new Request.Builder();
        builder.url(url);

        return builder;
    }
    public void execute(OkHttpClient okHttpClient, final CallBack callBack){
        callBack.onBefore();
        okHttpClient.newCall(getRequest()).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callBack.onError(e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                callBack.onResponse(response);
            }
        });

    }
}
