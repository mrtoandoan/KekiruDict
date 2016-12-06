package com.dict.kekiru.presentation.dictionary.activity;

import android.widget.Toast;

import com.dict.kekiru.base.BaseActivity;
import com.dict.kekiru.model.TestObject;
import com.dict.kekiru.net.API;
import com.dict.kekiru.net.APIResponse;
import com.dict.kekiru.net.response.TestResponse;
import com.dict.kekiru.utility.Log;

import java.util.List;

/**
 * Created by framgia on 06/12/2016.
 */

public class TestPresenter implements TestContract.Presenter {
    private final String TAG = TestPresenter.class.getName();
    private BaseActivity mActivity;
    private TestContract.View mView;

    public TestPresenter(BaseActivity activity, TestContract.View view) {
        mActivity = activity;
        mView = view;
    }

}
