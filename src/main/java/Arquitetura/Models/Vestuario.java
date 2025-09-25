package Arquitetura.Models;

public class Vestuario implements IProduto{

    // Atributos
    private String nome;
    private double preco;
    private double tamanhoRoupa;

    // Construtor
    public Vestuario(String nome, double preco, double tamanhoRoupa) {
        this.nome = nome;
        this.preco = preco;
        this.tamanhoRoupa = tamanhoRoupa;
    }

    // Setters e Getters
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    public void setTamanhoRoupa(double tamanhoRoupa) {
        this.tamanhoRoupa = tamanhoRoupa;
    }

    public double getTamanhoRoupa() {
        return this.tamanhoRoupa;
    }

    // Métodos
}
