package com.samp.mobile.launcher.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.samp.mobile.R;

public class DownloadActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private TextView txtStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);

        progressBar = findViewById(R.id.progressBar);
        txtStatus = findViewById(R.id.txtStatus);

        progressBar.setMax(100);
        progressBar.setProgress(0);
        txtStatus.setText("Download em breve...");

        fakeLoading();
    }

    private void fakeLoading() {
        Handler handler = new Handler();
        final int[] progress = {0};

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                progress[0] += 4;
                progressBar.setProgress(progress[0]);

                if (progress[0] < 100) {
                    handler.postDelayed(this, 120);
                } else {
                    Intent intent = new Intent(DownloadActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };

        handler.postDelayed(runnable, 120);
    }
}
