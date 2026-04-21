package com.samp.mobile.launcher.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.samp.mobile.R;
import com.samp.mobile.game.SAMP;

public class MainActivity extends AppCompatActivity {

    private Button btnConnect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConnect = findViewById(R.id.btnConnect);

        btnConnect.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SAMP.class);
            intent.putExtra("server_ip", "15.204.150.91");
            intent.putExtra("server_port", 17930);
            startActivity(intent);
        });
    }
}
