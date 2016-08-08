package com.example.macbook.demorecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/**
 * Created by macbook on 8/3/16.
 */
public class DemoAdapter extends RecyclerView.Adapter<DemoViewHolder>  {



    List<DemoBean> demoBeanList;

    public DemoAdapter(List<DemoBean> demoBeanList)
    {
        this.demoBeanList = demoBeanList;
    }
    @Override
    public DemoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new DemoViewHolder(layoutInflater.inflate(R.layout.recyclerview_demo,parent,false));

    }
    DemoCallBack demoCallBack;
    public  void setOnItemClick(DemoCallBack demoCallBack)
    {
        this.demoCallBack = demoCallBack;
    }
    @Override
    public void onBindViewHolder(DemoViewHolder holder, int position) {
        holder.bind(demoBeanList.get(position));
        holder.setOnItemClick(demoCallBack);
    }

    @Override
    public int getItemCount() {
        return demoBeanList.size();
    }


}
