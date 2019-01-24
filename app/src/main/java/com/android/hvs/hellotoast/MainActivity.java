package com.android.hvs.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView countView;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View v) {
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show();
    }

    public void increaseCountByOne(View v) {
        count++;
        displayCount(count);
    }

    private void displayCount(int countValue) {
        countView = (TextView) findViewById(R.id.text_view);
        countView.setText(String.valueOf(countValue));
    }
}
