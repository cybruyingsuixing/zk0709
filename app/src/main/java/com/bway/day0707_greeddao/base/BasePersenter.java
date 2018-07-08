package com.bway.day0707_greeddao.base;

public abstract class BasePersenter <V extends IView> {


protected V view;

    public BasePersenter(V view) {
        this.view = view;
        initModel();
    }

    protected abstract void initModel();
}
