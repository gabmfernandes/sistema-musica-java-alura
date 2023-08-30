package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int curtidas;
    private int classificacao;
    private int totalClassificacoes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir(){
        curtidas++;
    }
    public void reproduzir(){
        totalReproducoes++;
    }
    public void classificar(int nota){
        totalClassificacoes++;
        classificacao = (classificacao + nota) / totalClassificacoes;
    }


}
