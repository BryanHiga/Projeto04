
package br.com.fatecpg;

public class Quiz {
    private String pergunta;
    private String resposta;
    private String[] alternativa;
    
    public Quiz(String pergunta, String resposta, String[] alternativa){
        this.pergunta = pergunta;
        this.resposta = resposta;
        this.alternativa = alternativa;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String[] getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(String[] alternativa) {
        this.alternativa = alternativa;
    }    
}
