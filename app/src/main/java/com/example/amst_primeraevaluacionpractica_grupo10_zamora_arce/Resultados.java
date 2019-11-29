package com.example.amst_primeraevaluacionpractica_grupo10_zamora_arce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {


    public int cantidad;

    TextView canti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        canti= (TextView) findViewById(R.id.txt_resp);
        canti.setText("Ha respondido" + cantidad + "preguntas");

    }
    public void volverajugar(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void fini(View view){
        finish();

    }
}
