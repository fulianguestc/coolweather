package com.coolweather.app.util;

/**
 * Created by fuliang on 15/10/22.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
