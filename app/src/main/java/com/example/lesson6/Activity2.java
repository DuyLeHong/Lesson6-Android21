package com.example.lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView tvResult = findViewById(R.id.tv_result);

        TextView tvResult2 = findViewById(R.id.tv_result2);

        //Bundle data = getIntent().getExtras();

        String sName = getIntent().getStringExtra(MainActivity.KEY_NAME);
        int age = getIntent().getIntExtra(MainActivity.KEY_AGE, 0);
        String sClass = getIntent().getStringExtra(MainActivity.KEY_CLASS);

        tvResult.setText(sName + " - " + age + " - " + sClass);

        MonHoc monHoc = (MonHoc) getIntent().getSerializableExtra(MainActivity.KEY_MONHOC);

        String yearCourse = monHoc.isNewCourse2022() ? "2022" : "2021";

        tvResult2.setText(monHoc.getsName() + " - " + monHoc.getNumCredit() + " - " + yearCourse);

//        findViewById(R.id.btn_click).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                onBackPressed();
//            }
//        });
    }

    public static final String KEY_DATA_FROM_ACTIVITY2 = "data_activity2";

    @Override
    public void onBackPressed() {
        Intent intent = getIntent();

        intent.putExtra(KEY_DATA_FROM_ACTIVITY2, "Du lieu tra ve: CodeFresher 30/5/2022");

        setResult(RESULT_OK, intent);

        super.onBackPressed();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_click:
                onBackPressed();
                break;
            case R.id.tv_result:
                Toast.makeText(getApplicationContext(), "TV Result 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_result2:
                Toast.makeText(getApplicationContext(), "TV Result 2", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}