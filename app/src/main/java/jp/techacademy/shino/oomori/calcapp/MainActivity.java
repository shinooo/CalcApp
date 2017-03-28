package jp.techacademy.shino.oomori.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText inputNum1;
    EditText inputNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNum1 =(EditText) findViewById(R.id.editText1);
        inputNum2 =(EditText) findViewById(R.id.editText2);

        Button buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(this);

        Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonMinus.setOnClickListener(this);

        Button buttonMultiple = (Button) findViewById(R.id.buttonMultiple);
        buttonMultiple.setOnClickListener(this);

        Button buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonDivide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("VALUE1", Double.parseDouble(inputNum1.getText().toString()));
        intent.putExtra("VALUE2", Double.parseDouble(inputNum2.getText().toString()));
        switch (v.getId()){
            case R.id.buttonAdd:
                intent.putExtra("VALUE3", 1);
                break;
            case R.id.buttonMinus:
                intent.putExtra("VALUE3", 2);
                break;
            case R.id.buttonMultiple:
                intent.putExtra("VALUE3", 3);
                break;
            case R.id.buttonDivide:
                intent.putExtra("VALUE3", 4);
                break;
            default:
                intent.putExtra("VALUE3", 0);
                break;
        }

        startActivity(intent);
    }

}
