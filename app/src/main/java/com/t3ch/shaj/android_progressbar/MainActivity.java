package com.t3ch.shaj.android_progressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressID);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                doWork();

            }
        });
        thread.start();
    }

    public void doWork() {
        for (progress = 10; progress <= 100; progress = progress + 10) {

            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
