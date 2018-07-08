package com.bway.day0707_greeddao.mvp.home.presenter;

import com.bway.day0707_greeddao.base.BasePersenter;
import com.bway.day0707_greeddao.mvp.home.model.HomeModel;
import com.bway.day0707_greeddao.mvp.home.model.bean.HomeBean;
import com.bway.day0707_greeddao.mvp.home.view.view.HomeView;

public class HomePresent extends BasePersenter<HomeView>{

    private static final String TAG = "HomePresent///";
    private HomeModel homeModel;

    public HomePresent(HomeView view) {
        super(view);
    }

    @Override
    protected void initModel() {
        homeModel = new HomeModel();
    }

    public void getNet(){
        homeModel.doNet(new HomeModel.onCallBack() {
            @Override
            public void onSuccess(HomeBean homeBean) {
                if (view!=null){
                    view.onSuccess(homeBean);
                }
            }

            @Override
            public void onFaild(String error) {
                if (view!=null){
                    view.onFaild(error);
                }
            }
        });
    }
}
