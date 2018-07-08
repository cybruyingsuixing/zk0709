package com.bway.day0707_greeddao.mvp.home.view.fragment;


import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.bway.day0707_greeddao.DaoManager;
import com.bway.day0707_greeddao.R;
import com.bway.day0707_greeddao.base.BaseFragment;
import com.bway.day0707_greeddao.database.DaoSession;
import com.bway.day0707_greeddao.database.PersonDao;
import com.bway.day0707_greeddao.mvp.home.model.bean.HomeBean;
import com.bway.day0707_greeddao.mvp.home.model.bean.Person;
import com.bway.day0707_greeddao.mvp.home.presenter.HomePresent;
import com.bway.day0707_greeddao.mvp.home.view.adapter.MyAdapter;
import com.bway.day0707_greeddao.mvp.home.view.view.HomeView;
import com.jcodecraeer.xrecyclerview.XRecyclerView;


import java.util.List;

public class HomeFragment extends BaseFragment<HomePresent> implements HomeView, View.OnClickListener {

    private MyAdapter myAdapter;
    private XRecyclerView xRecyclerView;
    int a = 1;
    private DaoSession daoSession;
    private PersonDao personDao;
    private static final String TAG = "HomeFragment****";
    private Button dian;

    @Override
    protected void initData() {
        presenter.getNet();
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initViews(View view) {
        xRecyclerView = view.findViewById(R.id.home_xrecyler);
        dian = view.findViewById(R.id.dian);
        dian.setOnClickListener(this);
    }


    @Override
    protected int provId() {
        return R.layout.homefragment;
    }

    @Override
    protected HomePresent provide() {
        return new HomePresent((HomeView) this);
    }


    @Override
    public void onSuccess(HomeBean homeBean) {
        List<HomeBean.DataBean> data = homeBean.getData();
        myAdapter = new MyAdapter(data);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        xRecyclerView.setLayoutManager(linearLayoutManager);
        xRecyclerView.setAdapter(myAdapter);

        xRecyclerView.setSaveFromParentEnabled(true);
        xRecyclerView.setLoadingMoreEnabled(true);
        xRecyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                a = 1;
                initData();
                xRecyclerView.refreshComplete();
            }

            @Override
            public void onLoadMore() {
                a++;
                initData();
                xRecyclerView.refreshComplete();
            }
        });


        daoSession = DaoManager.instance(getContext()).getDaoSession();

        personDao = daoSession.getPersonDao();
        for (int i = 0; i < data.size(); i++) {
            personDao.insert(new Person(null, "" + data.get(i).getContent(),data.get(i).getCreateTime()));
        }


    }

    @Override
    public void onFaild(String error) {

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.dian:
                List<Person> list = personDao.queryBuilder()
                        .where(PersonDao.Properties.Id.gt(1))
                        .build()
                        .list();

                Log.d(TAG, "onClick: " + list.get(0).getName1());
                break;
        }
    }
}
