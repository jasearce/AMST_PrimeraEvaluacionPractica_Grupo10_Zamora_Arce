package com.example.amst_primeraevaluacionpractica_grupo10_zamora_arce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnEmp;
    private TextView nameApp, autores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEmp = (Button)findViewById(R.id.btn_empezar);
        nameApp = (TextView) findViewById(R.id.txt_app);
        autores = (TextView)findViewById(R.id.txt_autores);
        /*btnEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
    }

    public void pasarAPreguntas(View view){
        Intent intent = new Intent(MainActivity.this, Preguntas.class);
        startActivity(intent);
    }
}
