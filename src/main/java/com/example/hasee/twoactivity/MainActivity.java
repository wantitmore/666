package com.example.hasee.twoactivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "rilegoule，好吧", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "rilegoule，no", Toast.LENGTH_SHORT).show();
		//alright

    }
}
