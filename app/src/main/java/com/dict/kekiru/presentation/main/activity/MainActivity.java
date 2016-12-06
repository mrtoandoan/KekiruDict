package com.dict.kekiru.presentation.main.activity;

import android.os.Bundle;

import com.dict.kekiru.R;
import com.dict.kekiru.base.BaseActivity;
import com.dict.kekiru.model.TestObject;

public class MainActivity extends BaseActivity implements MainContract.View {
    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void initViews() {
        mPresenter = new MainPresenter(this, this);
        mPresenter.testFunction();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void updateUI(TestObject obj) {
        // TODO: Fill object to
    }
}
