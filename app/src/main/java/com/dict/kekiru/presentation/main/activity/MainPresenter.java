package com.dict.kekiru.presentation.main.activity;

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

public class MainPresenter implements MainContract.Presenter {
    private final String TAG = MainPresenter.class.getName();
    private BaseActivity mActivity;
    private MainContract.View mView;
    private List<TestObject> mObjects;

    public MainPresenter(BaseActivity activity, MainContract.View view) {
        mActivity = activity;
        mView = view;
    }

    @Override
    public void testFunction() {
        API.testFunction(null, new API.APICallback<APIResponse<TestResponse>>() {
            @Override
            public void onResponse(APIResponse<TestResponse> response) {
                Log.d(TAG, response.getData().toString());
                mObjects = response.getData().getTestObjects();
                mView.updateUI(mObjects.get(0));
            }

            @Override
            public void onFailure(int code, String message) {
                Toast.makeText(mActivity, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
