package com.kimsangsu.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private String resultStr;
    private String totalString;
    private EditText result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (EditText) findViewById(R.id.editText);

        //Number Button
        findViewById(R.id.num0).setOnClickListener(numbtnClickListner);
        findViewById(R.id.num1).setOnClickListener(numbtnClickListner);
        findViewById(R.id.num2).setOnClickListener(numbtnClickListner);
        findViewById(R.id.num3).setOnClickListener(numbtnClickListner);
        findViewById(R.id.num4).setOnClickListener(numbtnClickListner);
        findViewById(R.id.num5).setOnClickListener(numbtnClickListner);
        findViewById(R.id.num6).setOnClickListener(numbtnClickListner);
        findViewById(R.id.num7).setOnClickListener(numbtnClickListner);
        findViewById(R.id.num8).setOnClickListener(numbtnClickListner);
        findViewById(R.id.num9).setOnClickListener(numbtnClickListner);
        findViewById(R.id.dot).setOnClickListener(numbtnClickListner);
        findViewById(R.id.bracket).setOnClickListener(numbtnClickListner);

        //symbol Button Action
        findViewById(R.id.del).setOnClickListener(symbolBtnClickListner);
        findViewById(R.id.mod).setOnClickListener(symbolBtnClickListner);
        findViewById(R.id.min).setOnClickListener(symbolBtnClickListner);
        findViewById(R.id.add).setOnClickListener(symbolBtnClickListner);
        findViewById(R.id.equal).setOnClickListener(symbolBtnClickListner);
        findViewById(R.id.ac).setOnClickListener(symbolBtnClickListner);
        findViewById(R.id.div).setOnClickListener(symbolBtnClickListner);
        findViewById(R.id.mul).setOnClickListener(symbolBtnClickListner);
    }
        //number Button Action Method
    Button.OnClickListener numbtnClickListner = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.num0:
                    if((totalString == null) || (resultStr != null) ) {
                        totalString = "0";
                        resultStr = null;
                    }
                    else
                        totalString += "0";
                    result.setText(totalString);
                    break;
                case R.id.num1:
                    if((totalString == null) || (resultStr != null) ) {
                        totalString = "1";
                        resultStr = null;
                    }
                    else
                        totalString += "1";
                    result.setText(totalString);
                    break;
                case R.id.num2:
                    if((totalString == null) || (resultStr != null) ) {
                        totalString = "2";
                        resultStr = null;
                    }
                    else
                        totalString += "2";
                    result.setText(totalString);
                    break;
                case R.id.num3:
                    if((totalString == null) || (resultStr != null) ) {
                        totalString = "3";
                        resultStr = null;
                    }
                    else
                        totalString += "3";
                    result.setText(totalString);
                    break;
                case R.id.num4:
                    if((totalString == null) || (resultStr != null) ) {
                        totalString = "4";
                        resultStr = null;
                    }
                    else
                        totalString += "4";
                    result.setText(totalString);
                    break;

                case R.id.num5:
                    if((totalString == null) || (resultStr != null) ) {
                        totalString = "5";
                        resultStr = null;
                    }
                    else
                        totalString += "5";
                    result.setText(totalString);
                    break;

                case R.id.num6:
                    if((totalString == null) || (resultStr != null) ) {
                        totalString = "6";
                        resultStr = null;
                    }
                    else
                        totalString += "6";
                    result.setText(totalString);
                    break;

                case R.id.num7:
                    if((totalString == null) || (resultStr != null) ) {
                        totalString = "7";
                        resultStr = null;
                    }
                    else
                        totalString += "7";
                    result.setText(totalString);
                    break;

                case R.id.num8:
                    if((totalString == null) || (resultStr != null) ) {
                        totalString = "8";
                        resultStr = null;
                    }
                    else
                        totalString += "8";
                    result.setText(totalString);
                    break;

                case R.id.num9:
                    if((totalString == null) || (resultStr != null) ) {
                        totalString = "9";
                        resultStr = null;
                    }
                    else
                        totalString += "9";
                    result.setText(totalString);
                    break;
                case R.id.dot:
                    if((totalString == null) || (resultStr != null) ) {
                        totalString = "0.";
                        resultStr = null;
                    }
                    else
                        totalString += ".";
                    result.setText(totalString);
                    break;
            }
        }
    };

    //symbol Button Action Method
    Button.OnClickListener symbolBtnClickListner = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
}
