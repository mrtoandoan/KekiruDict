package com.dict.kekiru.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dict.kekiru.R;

import butterknife.ButterKnife;

/**
 * Created by HungNT on 8/3/16.
 */
public abstract class BaseActivity extends AppCompatActivity {
    private static final String TAG = BaseActivity.class.getName();

    protected ProgressDialog mDialog;

    public abstract void initViews();

    public abstract int getLayoutId();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        initViews();
    }

    public void showDialog() {
        if (mDialog == null) initDialog();
        if (mDialog != null && !mDialog.isShowing()) mDialog.show();
    }

    public void dismissDialog() {
        if (mDialog != null && mDialog.isShowing()) mDialog.dismiss();
    }

    private void initDialog() {
        mDialog = new ProgressDialog(this);
        mDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        mDialog.setMessage(getString(R.string.dialog_loading_message));
        mDialog.setIndeterminate(true);
        mDialog.setCanceledOnTouchOutside(false);
    }

}

