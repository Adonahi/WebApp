package com.unam.unica.adonahi.webapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    EditText etxtURL;
    Button btnNavegar;
    SeekBar sbTamanho;
    String URL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxtURL = findViewById(R.id.etxtURL);
        btnNavegar = findViewById(R.id.btnNavegar);
        sbTamanho = findViewById(R.id.sbTamanho);

        sbTamanho.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) { //0-100 int i
                etxtURL.setTextSize((float) i/2);
                btnNavegar.setTextSize((float) i/2);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Acciones cuando se toque la seekbar
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Acciones cuando se pare la seekbar
            }
        });

        btnNavegar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                URL = etxtURL.getText().toString();
                intent.putExtra("URL", URL);
                startActivity(intent);
            }
        });

    }
}