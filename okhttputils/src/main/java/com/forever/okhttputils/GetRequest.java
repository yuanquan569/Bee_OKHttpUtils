package com.forever.okhttputils;

import okhttp3.Request;

/**
 * Created by 35292 on 2017/7/22 0022.
 */

public class GetRequest extends OKHttpRequest{

    private Request.Builder mBuilder;

    public GetRequest(String url){

        mBuilder = generateBuild(url);
        mBuilder.get();
    }

    @Override
    public Request getRequest() {
        return mBuilder.build();
    }
}


