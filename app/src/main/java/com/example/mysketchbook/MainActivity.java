package com.example.mysketchbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnPaint, btnText, btnClear;
    private PaintArea paintArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPaint = (ImageButton) findViewById(R.id.btnPaint);
        btnText = (ImageButton) findViewById(R.id.btnText);
        btnClear = (ImageButton) findViewById(R.id.btnClear);
        paintArea = (PaintArea) findViewById(R.id.paint);
        paintArea.setVisibility(View.INVISIBLE);
    }

    public void onBtnTextClick(View view) {
    }

    public void onBtnPaintClick(View view) {
        paintArea.setVisibility(View.VISIBLE);
    }

    public void onBtnClearClick(View view) {
        paintArea.cleanPaintArea();
    }
}