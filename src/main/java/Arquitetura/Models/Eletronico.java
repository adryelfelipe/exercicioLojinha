package Arquitetura.Models;

public class Eletronico implements IProduto {

    // Atributos
    private String nome;
    private int garantiaMeses;
    private double preco;

    // Construtor
    public Eletronico(String nome, int garantiaMeses, double preco) {
        this.nome = nome;
        this.garantiaMeses = garantiaMeses;
        this.preco = preco;
    }

    // Setters e Getters
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    public void setGarantiaMeses(int tempoGarantia) {
        this.garantiaMeses = tempoGarantia;
    }

    public int getGarantiaMeses () {
        return  this.garantiaMeses;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    // Métodos


}
