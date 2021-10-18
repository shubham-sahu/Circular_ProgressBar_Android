package com.example.circulardetermineprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int progress = 0;
    private Button buttonIncr;
    private Button buttonDecr;
    private ProgressBar progressBar;
    private TextView progressText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonIncr = findViewById(R.id.button_incr);
        buttonDecr = findViewById(R.id.button_decr);
        progressBar = findViewById(R.id.circle_bar);
        progressText = findViewById(R.id.progress_percent);

        updateProgress();

        buttonIncr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(progress != 100){
                    progress +=10;
                    updateProgress();
                }
            }
        });
        buttonDecr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(progress != 0){
                    progress -=10;
                    updateProgress();
                }
            }
        });

    }

    private void updateProgress(){

        progressBar.setProgress(progress);
        progressText.setText(progress+"%");
    }
}