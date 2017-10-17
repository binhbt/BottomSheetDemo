package com.demo.bottomsheetdemo;

import android.app.Dialog;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.View;

/**
 * Created by t430 on 10/17/2017.
 */

public class CustomDialogSheet extends BottomSheetDialogFragment {
    @Override
    public void setupDialog(Dialog dialog, int style) {
        super.setupDialog(dialog, style);
        View contentView = View.inflate(getContext(), R.layout.bottomshet_custom, null);
        dialog.setContentView(contentView);
    }
}
