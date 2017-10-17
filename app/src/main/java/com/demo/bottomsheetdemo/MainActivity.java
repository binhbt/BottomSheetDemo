package com.demo.bottomsheetdemo;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View bottomSheet1 = findViewById(R.id.botton_sheet1);
        final BottomSheetBehavior bottomSheetBehavior1 = BottomSheetBehavior.from(bottomSheet1);
        final Button btn1 =  (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bottomSheetBehavior1.getState() != BottomSheetBehavior.STATE_EXPANDED){
                    bottomSheetBehavior1.setState(BottomSheetBehavior.STATE_EXPANDED);
                    btn1.setText("Collapse Sheet 1");
                }else{
                    bottomSheetBehavior1.setState(BottomSheetBehavior.STATE_COLLAPSED);
                    btn1.setText("Expand Sheet 1");
                }
            }
        });

        final Button btn2 =  (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialogSheet customDialogSheet = new CustomDialogSheet();
                customDialogSheet.show(getSupportFragmentManager(), "custom_sheet");
            }
        });
    }
}
