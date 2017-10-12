/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.quiz;

public class Questão {
        private String questao;
        private String responda;
        private String alternativa[];

    public Questão(String questao, String responda, String[] alternativa) {
        this.questao = questao;
        this.responda = responda;
        this.alternativa = alternativa;
    }

    public String[] getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(String[] alternativa) {
        this.alternativa = alternativa;
    }

    public String getQuestao() {
        return questao;
    }

    public void setQuestao(String questao) {
        this.questao = questao;
    }

    public String getResponda() {
        return responda;
    }

    public void setResponda(String responda) {
        this.responda = responda;
    }
}
    