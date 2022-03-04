package com.example.lesson6;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_NAME = "key_name";
    public static final String KEY_AGE = "key_age";
    public static final String KEY_CLASS = "key_class";
    public static final String KEY_MONHOC = "key_monhoc";

    public static final int REQUEST_CODE_TO_ACTIVITY2 = 101;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_TO_ACTIVITY2) {
            if (resultCode == RESULT_OK) {
                String sData = data.getStringExtra("data2");

                Toast.makeText(getApplicationContext(), sData, Toast.LENGTH_SHORT).show();
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activity2.class);

                String sName = "Nguyen Hoang Long";
                int age = 22;
                String sClass = "CNTT 2 - K45";

                intent.putExtra(KEY_NAME, sName);
                intent.putExtra(KEY_AGE, age);
                intent.putExtra(KEY_CLASS, sClass);

                MonHoc monHoc = new MonHoc("Lap trinh Android", 3, true);

                intent.putExtra(KEY_MONHOC, monHoc);

                startActivityForResult(intent, REQUEST_CODE_TO_ACTIVITY2);

                //finish();
            }
        });
    }
}