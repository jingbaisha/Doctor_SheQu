package com.fanwang.demo_doctor_community.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.fanwang.demo_doctor_community.R;
import com.fanwang.demo_doctor_community.commonality.Populace_Activity;
import com.fanwang.demo_doctor_community.commonality.TitleBackFragment;

public class Health_bianji extends Populace_Activity{
    private TitleBackFragment titleBackFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.health_record_activity_bian);
        initData();
        initView();
    }

    @Override
    public void initView() {
        titleBackFragment = new TitleBackFragment().newInstance("编辑基本信息", "#23b1a5");
        addTitleFragment(titleBackFragment);
    }

    @Override
    public void initData() {

    }
}
