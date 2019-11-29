package com.example.amst_primeraevaluacionpractica_grupo10_zamora_arce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.PrecomputedText;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Preguntas extends AppCompatActivity {

    public HashMap<Integer,Question> map = new HashMap<Integer, Question>() ;
    public Question pregunta1 = new Question("Como se undio titanic","nose1","iceberg","noseee","cinco");
    public Question pregunta2 = new Question("Nombre reina inglaterra","maria","isabel","carmen","cinco");
    public Question pregunta3 = new Question("Nombre de presidente","correa","lenin","abdala","lucio");
    public Question pregunta4 = new Question("Que grupo es este","dos","diez","emelec","tresss");
    public Question PREGUNTA;
    public ArrayList<Integer> numeritos = new ArrayList<>();
    public Button bt1 , bt2 ,bt3,bt4;
    public TextView preguntastring;
    public  Random rnd = new Random();
    public int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);
        creartodo();
    }
    public void creartodo(){
        map.put(1,pregunta1);
        map.put(2,pregunta2);
        map.put(3,pregunta3);
        map.put(4,pregunta4);
        bt1 = (Button) findViewById(R.id.resp1);
        bt2 = (Button) findViewById(R.id.resp2);
        bt3 = (Button) findViewById(R.id.resp3);
        bt4 = (Button) findViewById(R.id.resp4);
        preguntastring = (TextView) findViewById(R.id.preguntita);
        cambioPregunta();
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(bt1.getText());
                if(bt1.getText().equals(PREGUNTA.getCorreta())){
                    contador+=1;
                    cambioPregunta();
                }
                else{
                    Intent intent = new Intent(Preguntas.this, Resultados.class);

                    startActivity(intent);
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bt2.getText().equals(PREGUNTA.getCorreta())){
                    contador+=1;
                    cambioPregunta();
                }
                else{
                    Intent intent = new Intent(Preguntas.this, Resultados.class);
                    startActivity(intent);
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bt3.getText().equals(PREGUNTA.getCorreta())){
                    contador+=1;
                    cambioPregunta();
                }
                else{
                    Intent intent = new Intent(Preguntas.this, Resultados.class);
                    startActivity(intent);
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bt4.getText().equals(PREGUNTA.getCorreta())){
                    contador+=1;
                    cambioPregunta();
                }
                else{
                    Intent intent = new Intent(Preguntas.this, Resultados.class);
                    startActivity(intent);
                }
            }
        });
    }

    public void cambioPregunta(){
        if (contador >= 4) {
            Intent intent = new Intent(Preguntas.this, Codigoqr.class);
            startActivity(intent);
        }
        else {
            Random rndT = new Random();
            int numero = rndT.nextInt(4) + 1;
            PREGUNTA = map.get(numero);
            System.out.println(PREGUNTA.getPregunta());
            bt1.setText(PREGUNTA.getResp1());
            bt2.setText(PREGUNTA.getResp2());
            bt3.setText(PREGUNTA.getResp3());
            bt4.setText(PREGUNTA.getResp4());
            preguntastring.setText(PREGUNTA.getPregunta());
        }
    }

    public boolean validarnumero(int numero){
        boolean flag = false;
        if (!numeritos.contains(numero)){
            numeritos.add(numero);
            return true;
        }
        return false;
    }

}
