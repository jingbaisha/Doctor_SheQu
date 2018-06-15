package com.fanwang.demo_doctor_community.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.fanwang.demo_doctor_community.R;
import com.fanwang.demo_doctor_community.adapter.Eat_adapter;
import com.fanwang.demo_doctor_community.bean.Eat_bean;
import com.fanwang.demo_doctor_community.commonality.Populace_Activity;
import com.fanwang.demo_doctor_community.commonality.TitleBackFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by edison on 2018/6/12.
 */

public class Eat_Activity extends Populace_Activity {

    @BindView(R.id.rcy)
    RecyclerView rcy;
    private TitleBackFragment titleBackFragment;
    private List<Eat_bean> list=new ArrayList<>();
    private Eat_adapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eat_activity);
        ButterKnife.bind(this);
        initView();
        initData();
    }

    @Override
    public void initView() {
        titleBackFragment = new TitleBackFragment().newInstance("吃药提醒", "#23b1a5");
        addTitleFragment(titleBackFragment);
    }

    @Override
    public void initData() {
        Eat_bean bean=new Eat_bean();
        bean.setData("上午");
        bean.setTime("08:00");
        list.add(bean);

        adapter = new Eat_adapter(this,list);
        rcy.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rcy.setAdapter(adapter);
    }

    @OnClick({R.id.rl_add})
    public void addTime(View view){
        switch (view.getId()){
            case R.id.rl_add:
                Eat_bean bean=new Eat_bean();
                bean.setData("下午");
                bean.setTime("16:00");
                list.add(bean);
                adapter.notifyDataSetChanged();
                break;
        }
    }
}
