package com.dict.kekiru.net.response;

import com.dict.kekiru.model.TestObject;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by framgia on 06/12/2016.
 */

public class TestResponse {
    @SerializedName("test_objecs")
    private List<TestObject> mTestObjects;

    public List<TestObject> getTestObjects() {
        return mTestObjects;
    }

    public void setTestObjects(List<TestObject> testObjects) {
        mTestObjects = testObjects;
    }
}
