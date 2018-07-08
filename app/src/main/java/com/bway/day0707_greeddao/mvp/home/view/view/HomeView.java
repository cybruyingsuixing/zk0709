package com.bway.day0707_greeddao.mvp.home.view.view;

import com.bway.day0707_greeddao.base.IView;
import com.bway.day0707_greeddao.mvp.home.model.bean.HomeBean;

public interface HomeView extends IView{

    void onSuccess(HomeBean homeBean);
    void onFaild(String error);
}
