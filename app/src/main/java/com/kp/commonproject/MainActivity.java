package com.kp.commonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Hello world", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Second Change", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Third Change", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Fifth Change", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Fourth Change", Toast.LENGTH_SHORT).show();


}
}
