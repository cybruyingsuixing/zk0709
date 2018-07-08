package com.bway.day0707_greeddao;

import android.content.Context;

import com.bway.day0707_greeddao.database.DaoMaster;
import com.bway.day0707_greeddao.database.DaoSession;

public class DaoManager {

    private  DaoSession daoSession;
    private static DaoManager daoManager;

    private DaoManager(Context context) {
        this.daoSession = DaoMaster.newDevSession(context, "my.db");
    }


    public static DaoManager instance(Context context) {
        if (daoManager == null) {
            synchronized (DaoManager.class) {
                if (daoManager == null) {
                    daoManager = new DaoManager(context);
                }
            }
        }
        return daoManager;
    }


    public DaoSession getDaoSession() {
        return daoSession;
    }

}
