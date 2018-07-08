package com.bway.day0707_greeddao.mvp.home.view.adapter;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bway.day0707_greeddao.R;
import com.bway.day0707_greeddao.mvp.home.model.bean.HomeBean;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter {

    private List<HomeBean.DataBean> list;

    public MyAdapter(List<HomeBean.DataBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = View.inflate(parent.getContext(), R.layout.home_item, null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((MyHolder)holder).tv_name.setText(list.get(position).getContent());
        ((MyHolder)holder).tv_date.setText(list.get(position).getCreateTime());
        String pic = list.get(position).getUser().getIcon();
        if (!TextUtils.isEmpty(pic)){
            Uri uri = Uri.parse(pic);
            ((MyHolder)holder).face1.setImageURI(uri);
            ((MyHolder)holder).face2.setImageURI(uri);
        }
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        private final SimpleDraweeView face1;
        private final TextView tv_name;
        private final TextView tv_date;
        private final SimpleDraweeView face2;

        public MyHolder(View itemView) {
            super(itemView);
            face1 = itemView.findViewById(R.id.item1_face);
            tv_name = itemView.findViewById(R.id.item1_tv_name);
            tv_date = itemView.findViewById(R.id.item1_tv_date);
            face2 = itemView.findViewById(R.id.item1_faso);
        }
    }

}
