package jp.techacademy.shino.oomori.calcapp;

import android.content.Intent;
import android.support.annotation.FloatRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        double value1 = intent.getDoubleExtra("VALUE1", 0);
        double value2 = intent.getDoubleExtra("VALUE2", 0);
        int intCalcWay = intent.getIntExtra("VALUE3", 0);

        double result = 0;

        TextView textView = (TextView) findViewById(R.id.textView1);

        if(intCalcWay == 1){
            result = value1 + value2;
        }else if(intCalcWay == 2){
            result = value1 - value2;
        }else if(intCalcWay == 3){
            result = value1 * value2;
        }else if(intCalcWay == 4){
            result = value1 / value2;
        }

        textView.setText(String.valueOf(result));
    }
}
