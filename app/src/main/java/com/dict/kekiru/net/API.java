package com.dict.kekiru.net;

import com.dict.kekiru.model.TestObject;
import com.dict.kekiru.net.response.TestResponse;

import java.util.Map;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ToanDV on 8/5/16.
 */
public abstract class API {

    private static final APIServices client = new Retrofit.Builder()
            .baseUrl(APIDefinition.getBaseUrl())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(APIServices.class);


    public static void testFunction(Map<String, String> testParams ,
                                    final APICallback<APIResponse<TestResponse>> callback) {
        client
                .testFunction(testParams)
                .enqueue(new RetrofitCallback<>(callback));
    }


    public interface APICallback<T> {
        void onResponse(T response);

        void onFailure(int code, String message);
    }
}
