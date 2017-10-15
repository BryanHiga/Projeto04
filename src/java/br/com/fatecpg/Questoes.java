
package br.com.fatecpg;
import java.util.ArrayList;
import java.util.Collections; //dentro do collections tem a função shuffle 

public class Questoes {
    private static double ultNota = 0.0; //iniciando a variável com valor 0
    private static double resTotal = 0.0; //média final total
    private static int ct = 0; //contador de quantas vezes jogou
    private static ArrayList<Quiz> teste; //vai guardar as perguntas, resposta e as alternativas
    
    public static double validaTeste(String[] resposta){
        int correto = 0; //quando começa ela inicia com valor 0
        
        for (int i = 0; i < teste.size(); i++){ //para aparecer uma pergunta de cada vez
            Quiz q = teste.get(i);
            if (q.getResposta().equals(resposta[i])){
                correto++;
            }
        }
        double nota = (100 * (double) correto) / (double) teste.size();
        ct++;
        resTotal+= nota;
        ultNota = nota;
        
        return nota;
    }
    
    public static double calculaMedia(){
        double media = 0.0;
        media = resTotal / ct;
        
        return media;
    }
    
    public static ArrayList<Quiz> getTeste(){
        if (teste == null){
            teste = new ArrayList<>();
            
            Quiz q1 = new Quiz("Qual o total de reliquias da morte? ",
                    "3 Reliquias", new String[]{"3 Reliquias","2 Reliquias","4 Reliquias"});
            
            Quiz q2 = new Quiz("Quem disse essa frase: Não tenha pena dos mortos, Harry, "
                    + "tenha pena dos vivos, e acima de tudo, daqueles que vivem sem amor.",
                    "Alvo Dumbledore", new String[]{"Alvo Dumbledore","Severo Snape","Lillian Potter"});
            
            Quiz q3 = new Quiz("Quantos filhos Harry tem?","3 filhos",
                    new String[]{"3 filhos","2 filhos","4 filhos"});
            
            Quiz q4 = new Quiz("Complete a frase: a cicatriz não incomodará Harry...",
                    "... nos ultimos dezenove anos. Tudo estava bem.", 
                    new String[]{"... nos ultimos dezenove anos. Tudo estava bem.",
                        "... nunca mais.", "Esta frase não existe."});
            
            Quiz q5 = new Quiz("Qual a horcrux que Régulo Black pega?",
                    "O medalhao de Slytherin", new String[]{"O anel dos Gunt", 
                        "O medalhao de Slytherin","A taça de Hufflepuff"});
            
            Quiz q6 = new Quiz("O que hagrid dá a harry em seu aniversário de onze anos?","Um bolo",
                    new String[]{"Uma varinha","O Monstruoso Livro dos Monstros","Um bolo"});
            
            Quiz q7 = new Quiz("Qual o núcleo da varinha de harry e voldemort?",
                    "Pena de fenix", new String[]{"Escama de dragão","Pena de fenix","Pelo de Unicórnio"});
            
            Quiz q8 = new Quiz("Quem morre no filme/livro O Calice de fogo?","Cedrico",
                    new String[]{"Cedrico","Roni","Edward Cullen"});
            
            Quiz q9 = new Quiz("Qual o efeito do feitiço avada kedrava?",
                    "Morte", new String[]{"Morte","Dor","Cortes"});
            
            Quiz q10 = new Quiz("Quem criou o feitiço sectumsempra?","Severo Snape",
                    new String[]{"Alvo Dumbledore","Salazar Slytherin","Severo Snape"});
            
            teste.add(q1);
            teste.add(q2);
            teste.add(q3);
            teste.add(q4);
            teste.add(q5);
            teste.add(q6);
            teste.add(q7);
            teste.add(q8);
            teste.add(q9);
            teste.add(q10);
        }
        Collections.shuffle(teste);
        return teste;
    }

    public static double getUltNota() {
        return ultNota;
    }

    public static void setUltNota(double ultNota) {
        Questoes.ultNota = ultNota;
    }

    public static double getResTotal() {
        return resTotal;
    }

    public static void setResTotal(double resTotal) {
        Questoes.resTotal = resTotal;
    }

    public static int getCt() {
        return ct;
    }

    public static void setCt(int ct) {
        Questoes.ct = ct;
    }
    
    public static void Limpar(){
        Questoes.ct = 0;
        Questoes.ultNota = 0.0;
        Questoes.resTotal = 0.0;
        Questoes.teste = null;
    }
}
