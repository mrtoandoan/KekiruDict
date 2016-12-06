package com.dict.kekiru.net;

import com.dict.kekiru.model.TestObject;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by ToanDV on 8/5/16.
 */
public interface APIServices {
    @FormUrlEncoded
    @POST(APIDefinition.TestApi.PATH)
    Call<APIResponse<TestObject>> testFunction(@FieldMap Map<String, String> testParrams);
}
