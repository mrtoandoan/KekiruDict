package com.dict.kekiru.widget.dialog;

import android.app.Dialog;
import android.content.Context;

/**
 * Created by framgia on 06/12/2016.
 */

public class CumstomDialog extends Dialog {
    public CumstomDialog(Context context) {
        super(context);
    }

    public CumstomDialog(Context context, int themeResId) {
        super(context, themeResId);
    }

    protected CumstomDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }
}
