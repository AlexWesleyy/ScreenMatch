package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private boolean incluidoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoMinutos;

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void exibeFichaTecnico(){
        System.out.println("Nome do filme "+nome);
        System.out.println("Ano de lançamento do filme "+anoLancamento);
    }
    public void avalia(double nota){
        somaDasAvaliacoes +=nota;
        totalAvaliacoes++;

    }
    public double mediaAvaliacoes(){
        return somaDasAvaliacoes/totalAvaliacoes;
    }
}
