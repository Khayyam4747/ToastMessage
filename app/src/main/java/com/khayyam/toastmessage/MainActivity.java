package com.khayyam.toastmessage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.khayyam.toastlib.ToastMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastMessage.colorfulToast(MainActivity.this,"This is toast",R.color.white,R.color.colorPrimary,R.drawable.ic_android_green_24dp);
    }
}
