package com.example.macbook.demorecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity implements DemoCallBack {


    RecyclerView rvDemo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvDemo  = (RecyclerView) findViewById(R.id.rvDemo);
        rvDemo.setLayoutManager(new LinearLayoutManager(this));
        List<DemoBean> demoBeanList  = new ArrayList<>();
        for(int i = 0 ; i <200 ; i++)
        {
            demoBeanList.add(new DemoBean());
        }

        DemoAdapter demoAdapter = new DemoAdapter(demoBeanList);
        demoAdapter.setOnItemClick(this);
        rvDemo.setAdapter(demoAdapter);


    }

    @Override
    public void onClick(View view, int posttion) {
        Toast.makeText(this, "Vi tri " + posttion,
                Toast.LENGTH_SHORT).show();
    }
}
