package com.example.macbook.demorecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;

/**
 * Created by macbook on 8/3/16.
 */
public class DemoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{



    ImageView imgExam;

    TextView tvTile;
    DemoCallBack demoCallBack;

    public void setOnItemClick(DemoCallBack demoCallBack)
    {
        this.demoCallBack = demoCallBack;
    }



    TextView tvDec;
    public DemoViewHolder(View itemView) {
        super(itemView);
        imgExam = (ImageView) itemView.findViewById(R.id.imgExam);
        tvTile = (TextView) itemView.findViewById(R.id.tvTitle);
        tvDec = (TextView) itemView.findViewById(R.id.tvDec);
        itemView.setOnClickListener(this);
    }

    public void bind(DemoBean demoBean)
    {

        tvTile.setText(demoBean.title);
        tvDec.setText(demoBean.des);
        Glide.with(itemView.getContext())
                .load(demoBean.imgUrl)
                .into(imgExam);
    }


    @Override
    public void onClick(View view) {
        if(demoCallBack != null)
        {
            demoCallBack.onClick(view,getAdapterPosition());
        }
    }
}
