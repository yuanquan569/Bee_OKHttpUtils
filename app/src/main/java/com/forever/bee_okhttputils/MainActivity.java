package com.forever.bee_okhttputils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.forever.okhttputils.CallBack;
import com.forever.okhttputils.OKHttpManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OKHttpManager.getInstance_().get("http://www.csdn.net/", new CallBack() {
            @Override
            public void onError(Exception e) {

            }

            @Override
            public void onResponse(final Object response) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        ((TextView)findViewById(R.id.tv_ok)).setText(response.toString());
                    }
                });


            }
        });


    }
}
