package com.forever.okhttputils;

/**
 * Created by OnTouch on 2017/7/22 0022.
 */

public abstract class CallBack<T> {


    public void onBefore(){}
    public void onProgress(int progress){}
    public void onAfter(){}

    public abstract void onError(Exception e);
    public abstract void onResponse(T response);


}
