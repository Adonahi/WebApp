package com.unam.unica.adonahi.webapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.Button;

public class WebView extends AppCompatActivity {

    android.webkit.WebView wvPagina;
    Button btnEvaluacion;
    String URL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        wvPagina = findViewById(R.id.wvPagina);
        btnEvaluacion = findViewById(R.id.btnEvaluacion);

        URL = getIntent().getStringExtra("URL");

        wvPagina.setWebViewClient(new WebViewClient()); //Iniciardo el Web View

        wvPagina.loadUrl("https://" + URL); //Se debe poner https:// para que funcione. El usuario debe poner www.restodelapagina.com

        btnEvaluacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), Evaluacion.class);
                startActivity(intent2);
            }
        });

    }
}