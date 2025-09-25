package Arquitetura.Daos;

import Arquitetura.Models.IProduto;

import javax.swing.plaf.OptionPaneUI;
import java.util.ArrayList;

public class ProdutoDao {

    // Atributos
    private static final ArrayList<IProduto> produtos = new ArrayList<>();

    // Construtor
    public ProdutoDao() {

    }

    // Métodos

    // ---------- ADICIONA PRODUTOS NA LISTA DE PRODUTOS ---------- //
    public void adicionarProduto(IProduto produto) {
        produtos.add(produto);
    }

    // ---------- REMOVE PRODUTOS DA LISTA DE PRODUTOS ---------- //
    public void removerProduto(IProduto produto) {
        produtos.remove(produto);
    }

    // ---------- LISTA OS PRODUTOS DA ARRAYLIST DE PRODUTOS ---------- //
    public ArrayList<IProduto> listarProdutos() {
        return produtos;
    }

}
