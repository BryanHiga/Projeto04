
package br.com.fatecpg.quiz;
public class Usuario {

    private String nome;
    private int pontos;
    
public Usuario(String nome, int ponto){
    this.nome = nome;
    this.pontos = ponto;
    
    
}

    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
}

