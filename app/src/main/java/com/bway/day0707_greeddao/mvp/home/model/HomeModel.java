package com.bway.day0707_greeddao.mvp.home.model;

import android.util.Log;

import com.bway.day0707_greeddao.mvp.home.model.bean.HomeBean;
import com.bway.day0707_greeddao.utils.HttpConfig;
import com.bway.day0707_greeddao.utils.OkHttpUtils;
import com.google.gson.Gson;

public class HomeModel {

    private static final String TAG = "HomeModel****";
    public void doNet(final onCallBack onCallBack){

        OkHttpUtils.getInstance().doGet(HttpConfig.URL_ONE, new OkHttpUtils.onCallBack() {
            @Override
            public void onFaild(Exception e) {

            }

            @Override
            public void onResponse(String json) {

                Gson gson = new Gson();
                Log.d(TAG, "onResponse: "+json);
                HomeBean homeBean = gson.fromJson(json, HomeBean.class);
                String code = homeBean.getCode();
                if ("0".equalsIgnoreCase(code)){
                    if (onCallBack!=null){
                        onCallBack.onSuccess(homeBean);
                    }
                }else{
                    if (onCallBack!=null){
                        onCallBack.onFaild("错误");
                    }
                }
            }
        });
    }

    public interface onCallBack{
       void onSuccess(HomeBean homeBean);
       void onFaild(String error);
    }


}
