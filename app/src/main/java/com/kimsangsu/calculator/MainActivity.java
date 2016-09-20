package com.kimsangsu.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    private String totalString;
    private EditText result;
    private String valueString;
    private String op;
    private Queue<Object> postStack;
    private Stack<Object> operatorStack;
    private Stack<Object> calculatorStack;

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
        findViewById(R.id.del).setOnClickListener(symbolBtnClickListner2);
        findViewById(R.id.mod).setOnClickListener(symbolBtnClickListner);
        findViewById(R.id.min).setOnClickListener(symbolBtnClickListner);
        findViewById(R.id.add).setOnClickListener(symbolBtnClickListner);
        findViewById(R.id.equal).setOnClickListener(symbolBtnClickListner2);
        findViewById(R.id.ac).setOnClickListener(symbolBtnClickListner2);
        findViewById(R.id.div).setOnClickListener(symbolBtnClickListner);
        findViewById(R.id.mul).setOnClickListener(symbolBtnClickListner);

        postStack = new LinkedList<>();
        operatorStack = new Stack<>();
        calculatorStack = new Stack<>();
    }

    //number Button Action Method
    Button.OnClickListener numbtnClickListner = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.num0:
                    if (totalString == null) {
                        totalString = "0";
                    } else {
                        totalString += "0";
                        valueString += "0";
                    }
                    result.setText(totalString);
                    break;
                case R.id.num1:
                    if ((totalString == null)) {
                        totalString = "1";
                        valueString = "1";
                    } else {
                        totalString += "1";

                        if(valueString == null)
                            valueString = "1";
                        else
                            valueString += "1";
                    }
                    result.setText(totalString);
                    break;
                case R.id.num2:
                    if ((totalString == null)) {
                        totalString = "2";
                        valueString = "2";
                    } else {
                        totalString += "2";
                        if(valueString == null)
                            valueString = "2";
                        else
                            valueString += "2";

                    }
                    result.setText(totalString);
                    break;
                case R.id.num3:
                    if ((totalString == null)) {
                        totalString = "3";
                        valueString = "3";
                    } else {
                        totalString += "3";
                        if(valueString == null)
                            valueString = "3";
                        else
                            valueString += "3";
                    }
                    result.setText(totalString);
                    break;
                case R.id.num4:
                    if ((totalString == null)) {
                        totalString = "4";
                        valueString = "4";
                    } else {
                        totalString += "4";
                        if(valueString == null)
                            valueString = "4";
                        else
                            valueString += "4";
                    }
                    result.setText(totalString);
                    break;
                case R.id.num5:
                    if ((totalString == null)) {
                        totalString = "5";
                        valueString = "5";
                    } else {
                        totalString += "5";
                        if(valueString == null)
                            valueString = "5";
                        else
                            valueString += "5";
                    }
                    result.setText(totalString);
                    break;
                case R.id.num6:
                    if ((totalString == null)) {
                        totalString = "6";
                        valueString = "6";
                    } else {
                        totalString += "6";
                        if(valueString == null)
                            valueString = "6";
                        else
                            valueString += "6";
                    }
                    result.setText(totalString);
                    break;
                case R.id.num7:
                    if ((totalString == null)) {
                        totalString = "7";
                        valueString = "7";
                    } else {
                        totalString += "7";
                        if(valueString == null)
                            valueString = "7";
                        else
                            valueString += "7";
                    }
                    result.setText(totalString);
                    break;
                case R.id.num8:
                    if ((totalString == null)) {
                        totalString = "8";
                        valueString = "8";
                    } else {
                        totalString += "8";
                        if(valueString == null)
                            valueString = "8";
                        else
                            valueString += "8";
                    }
                    result.setText(totalString);
                    break;
                case R.id.num9:
                    if ((totalString == null)) {
                        totalString = "9";
                        valueString = "9";
                    } else {
                        totalString += "9";
                        if(valueString == null)
                            valueString = "9";
                        else
                            valueString += "9";
                    }
                    result.setText(totalString);
                    break;
                /*case R.id.dot:
                    if ((totalString == null)) {
                        totalString = "0.";
                        valueString = "0.";
                    } else {
                        totalString += ".";
                        if(valueString == null)
                            valueString = "0.";
                        else
                            valueString += ".";
                    }
                    result.setText(totalString);
                    break;*/
            }
        }
    };

    //symbol Button Action Method
    Button.OnClickListener symbolBtnClickListner = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(valueString != null)
                postStack.add(Integer.parseInt(valueString)); // 피연산자 푸쉬
            switch (view.getId()) {
                case R.id.mul:
                    op = "*";
                    if(totalString != null)
                        totalString += "*";
                    break;
                case R.id.div:
                    op = "/";
                    if(totalString != null)
                        totalString += "/";
                    break;
                case R.id.add:
                    op = "+";
                    if(totalString != null)
                        totalString += "+";
                    break;
                case R.id.min:
                    op = "-";
                    if(totalString != null)
                        totalString += "-";
                    break;
            }
            result.setText(totalString);
            /* 우선순위 계산하여 스택에 푸쉬
            *  operatorStack에 마지막으로 들어간 연산자 보다 우선순위가 크면 그냥 푸쉬
            *
            *  operatorStack에 마지막으로 들어간 연산자 보다 우선순위가 같으면
                     operatorStack 맨위의 연산자 pop하여 postStack에 push후 op를 연산자 스택에 푸쉬

            *  operatorStack에 마지막으로 들어간 연산자 보다 우선순위가 작으면
                     기존에 operatorStack에 들어있던 연산자 모두 postStack에 push 후 op를 operatorStack
                     스택에 푸쉬
            */

            if(operatorStack.isEmpty()) {
                operatorStack.push(op);
            }else {
                if(priority(op) > priority((String)operatorStack.peek())) {
                    operatorStack.push(op);
                }
                else if(priority(op) == priority((String)operatorStack.peek())) {
                    postStack.add(operatorStack.pop());
                    operatorStack.push(op);
                }
                else if(priority(op) < priority((String)operatorStack.peek())) {
                    while(operatorStack.size() != 0)
                        postStack.add(operatorStack.pop());
                    operatorStack.push(op);
                }
            }
            valueString = null;
        }
    };
    Button.OnClickListener symbolBtnClickListner2 = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            int val1,val2;
            int res;
            String resultstr;
            switch (view.getId()) {
                case R.id.equal:
                    if(valueString != null)
                        postStack.add(Integer.parseInt(valueString));
                   while(operatorStack.size() != 0)
                        postStack.add(operatorStack.pop());

                    while(postStack.size() > 0) {
                        if (postStack.element().equals("+")) {
                            val1 = (int) calculatorStack.pop();
                            val2 = (int) calculatorStack.pop();
                            res = val2 + val1;
                            calculatorStack.push(res);
                            postStack.remove();
                        } else if (postStack.element().equals("-")) {
                            val1 = (int) calculatorStack.pop();
                            val2 = (int) calculatorStack.pop();
                            res = val2 - val1;
                            calculatorStack.push(res);
                            postStack.remove();
                        } else if (postStack.element().equals("*")) {
                            val1 = (int) calculatorStack.pop();
                            val2 = (int) calculatorStack.pop();
                            res = val2 * val1;
                            calculatorStack.push(res);
                            postStack.remove();
                        } else if (postStack.element().equals("/")) {
                            val1 = (int) calculatorStack.pop();
                            val2 = (int) calculatorStack.pop();
                            res = val2 / val1;
                            calculatorStack.push(res);
                            postStack.remove();
                        } else {
                            calculatorStack.push(postStack.poll());
                        }
                    }
                    if(!calculatorStack.isEmpty()) {
                        resultstr = String.valueOf(calculatorStack.pop());
                        result.setText(resultstr);
                        valueString = resultstr;
                        totalString = resultstr;
                    }
                    break;

                case R.id.ac:
                    totalString = null;
                    valueString = null;
                    result.setText("");
                    break;
            }
        }
    };
    //우선순위 계산 메소드
    public int priority(String op) {
        int priority = 0;
        switch (op) {
            case "+": priority = 1; break;
            case "-": priority = 1; break;
            case "*": priority = 2; break;
            case "/": priority = 2; break;
        }
        return priority;
    }
}