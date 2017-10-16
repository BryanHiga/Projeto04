
package br.com.fatecpg;

//Criação da classe Jogador
public class Jogador {
    private static String nome;
    private static double media;
    private static double notaAnterior;    

    //Criação getter e setter
    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Jogador.nome = nome;
    }

    public static double getMedia() {
        return media;
    }

    public static void setMedia(double media) {
        Jogador.media = media;
    }

    public static double getNotaAnterior() {
        return notaAnterior;
    }

    public static void setNotaAnterior(double notaAnterior) {
        Jogador.notaAnterior = notaAnterior;
    }
    
    //Método para limpar
    public static void Limpar(){
        Jogador.nome = null;
        Jogador.media = 0.0;
        Jogador.notaAnterior = 0.0;
    }
}
