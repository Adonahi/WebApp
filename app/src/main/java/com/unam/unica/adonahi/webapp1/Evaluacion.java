package com.unam.unica.adonahi.webapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class Evaluacion extends AppCompatActivity {

    TextView txtEvaluacio1, txtEvaluacio2, txtEvaluacio3;
    RatingBar rbEvaluacion1, rbEvaluacion2, rbEvaluacion3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluacion);

        txtEvaluacio1 = findViewById(R.id.txtEvaluacion1);
        txtEvaluacio2 = findViewById(R.id.txtEvaluacion2);
        txtEvaluacio3 = findViewById(R.id.txtEvaluacion3);

        rbEvaluacion1 = findViewById(R.id.rbEvaluacion1);
        rbEvaluacion2 = findViewById(R.id.rbEvaluacion2);
        rbEvaluacion3 = findViewById(R.id.rbEvaluacion3);

        rbEvaluacion1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) { //0-5 paso 0.5, lo guarda la variable v
                txtEvaluacio1.setText(getString(R.string.txt_evaluacion1) + v);
            }
        });

        rbEvaluacion2.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                txtEvaluacio2.setText(getString(R.string.txt_evaluacion2) + v);
            }
        });

        rbEvaluacion3.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                txtEvaluacio3.setText(getString(R.string.txt_evaluacion3) + v);
            }
        });

    }
}