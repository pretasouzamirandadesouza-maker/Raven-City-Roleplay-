package com.samp.mobile.launcher.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.samp.mobile.R;

public class MainActivity extends AppCompatActivity {

    private Button btnConnect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConnect = findViewById(R.id.btnConnect);

        btnConnect.setOnClickListener(v -> {
            Toast.makeText(this, "Conectar no servidor", Toast.LENGTH_SHORT).show();
        });
    }
}
