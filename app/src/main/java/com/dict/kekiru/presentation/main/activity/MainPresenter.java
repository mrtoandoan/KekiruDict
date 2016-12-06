package com.dict.kekiru.presentation.main.activity;

import android.widget.Toast;

import com.dict.kekiru.base.BaseActivity;
import com.dict.kekiru.model.TestObject;
import com.dict.kekiru.net.API;
import com.dict.kekiru.net.APIResponse;
import com.dict.kekiru.utility.Log;

/**
 * Created by framgia on 06/12/2016.
 */

public class MainPresenter implements MainContract.Presenter {
    private final String TAG = MainPresenter.class.getName();
    private BaseActivity mActivity;
    private MainContract.View mView;

    public MainPresenter(BaseActivity activity, MainContract.View view) {
        mActivity = activity;
        mView = view;
    }

    @Override
    public void testFunction() {
        API.testFunction(null, new API.APICallback<APIResponse<TestObject>>() {
            @Override
            public void onResponse(APIResponse<TestObject> response) {
                Log.d(TAG, response.getData().toString());
                mView.updateUI(response.getData());
            }

            @Override
            public void onFailure(int code, String message) {
                Toast.makeText(mActivity, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
