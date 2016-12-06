package com.dict.kekiru.presentation.main.activity;

import com.dict.kekiru.model.TestObject;

/**
 * Created by framgia on 06/12/2016.
 */

public interface MainContract {
    interface View {
        void updateUI(TestObject obj);
    }

    interface Presenter {
        void testFunction();
    }
}
