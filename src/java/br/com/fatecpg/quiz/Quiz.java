/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.quiz;

import java.util.ArrayList;

public class Quiz {

    public static double nivelF = .0;
    public static double soma = .0;
    public static int contagem = 0;

    public static double getNivelFinal() {
        return nivelF;
    }

    public static double getMedia() {
        return soma / (double) contagem;
    }

    public static double Validacao(String[] responde) {
        int corrects = 0;
        for (int i = 0; i < pergunta.size(); i++) {
            Questão q = pergunta.get(i);
            if (q.getResponda().equals(responde[i])) {
                corrects++;
            }
        }
        double nivel = 100 * ((double) corrects / (double) pergunta.size());
        contagem++;
        soma += nivel;
        nivelF = nivel;
        return nivel;
    }

    private static ArrayList<Questão> pergunta;

    public static ArrayList<Questão> getPergunta() {
        if (pergunta == null) {
            pergunta = new ArrayList<>();
            Questão q1 = new Questão(
                    "\"" + "", "1-Questão ",
                    new String[]{
                        "ALTERNATIVA 1",
                        "ALTERNATIVA 2",
                        "ALTERNATIVA 3."
                    }
            );

            Questão q2 = new Questão(
                    "\"" + "", "2-Questão ",
                    new String[]{
                        "ALTERNATIVA 1",
                        "ALTERNATIVA 2",
                        "ALTERNATIVA 3."
                    }
            );

            Questão q3 = new Questão(
                    "\"" + "", "3-Questão ",
                    new String[]{
                        "ALTERNATIVA 1",
                        "ALTERNATIVA 2",
                        "ALTERNATIVA 3."
                    }
            );

            Questão q4 = new Questão(
                    "\"" + "", "4-Questão ",
                    new String[]{
                        "ALTERNATIVA 1",
                        "ALTERNATIVA 2",
                        "ALTERNATIVA 3."
                    }
            );

            Questão q5 = new Questão(
                    "\"" + "", "5-Questão ",
                    new String[]{
                        "ALTERNATIVA 1",
                        "ALTERNATIVA 2",
                        "ALTERNATIVA 3."
                    }
            );

            Questão q6 = new Questão(
                    "\"" + "", "6-Questão ",
                    new String[]{
                        "ALTERNATIVA 1",
                        "ALTERNATIVA 2",
                        "ALTERNATIVA 3."
                    }
            );

            Questão q7 = new Questão(
                    "\"" + "", "7-Questão ",
                    new String[]{
                        "ALTERNATIVA 1",
                        "ALTERNATIVA 2",
                        "ALTERNATIVA 3."
                    }
            );

            Questão q8 = new Questão(
                    "\"" + "", "8-Questão ",
                    new String[]{
                        "ALTERNATIVA 1",
                        "ALTERNATIVA 2",
                        "ALTERNATIVA 3."
                    }
            );

            Questão q9 = new Questão(
                    "\"" + "", "9-Questão ",
                    new String[]{
                        "ALTERNATIVA 1",
                        "ALTERNATIVA 2",
                        "ALTERNATIVA 3."
                    }
            );

            Questão q10 = new Questão(
                    "\"" + "", "10-Questão ",
                    new String[]{
                        "ALTERNATIVA 1",
                        "ALTERNATIVA 2",
                        "ALTERNATIVA 3."
                    }
            );

            pergunta.add(q1);
            pergunta.add(q2);
            pergunta.add(q3);
            pergunta.add(q4);
            pergunta.add(q5);
            pergunta.add(q6);
            pergunta.add(q7);
            pergunta.add(q8);
            pergunta.add(q9);
            pergunta.add(q10);
        }
        return pergunta;
    }
}
