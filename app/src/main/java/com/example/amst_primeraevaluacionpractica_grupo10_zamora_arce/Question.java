package com.example.amst_primeraevaluacionpractica_grupo10_zamora_arce;

public class Question {
    private String pregunta;
    private String resp1,resp2,resp3,resp4;
    private String correta;
    public Question(String pregunta,String resp1, String resp2, String resp3,String resp4){
        this.pregunta = pregunta;
        this.resp1=resp1;
        this.resp2=resp2;
        this.resp3=resp3;
        this.resp4=resp4;
        this.correta = resp2; /// PARA NOSOTROS LA CORRECTA SIEMPRE SERA

    }

    public String getPregunta() {
        return pregunta;
    }

    public String getResp1() {
        return resp1;
    }

    public String getResp2() {
        return resp2;
    }

    public String getResp3() {
        return resp3;
    }

    public String getResp4() {
        return resp4;
    }

    public String getCorreta() {
        return correta;
    }
}
