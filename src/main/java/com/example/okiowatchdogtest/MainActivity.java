package com.example.okiowatchdogtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class MainActivity extends AppCompatActivity {
    
    private static final String TAG = "OkioWatchdogTest";
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    
    public void makeRequest(View view) {
        new Thread() {
            @Override
            public void run() {
                try {
                    OkHttpClient client = new OkHttpClient();

                    Request request = new Request.Builder()
                            .url("http://www.google.com")
                            .build();
                    
                    Log.i(TAG, "makeRequest(): executing OKHttp call...");
                    Response response = client.newCall(request).execute();
                    Log.i(TAG, "makeRequest(): OKHttp response: " + response);
                } catch (IOException e) {
                    Log.e(TAG, "makeRequest(): exception thrown", e);
                }
            }
        }.start();
    }
    
}
