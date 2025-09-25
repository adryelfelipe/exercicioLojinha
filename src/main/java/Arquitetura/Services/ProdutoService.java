package Arquitetura.Services;

import Arquitetura.Daos.ProdutoDao;
import Arquitetura.Models.IProduto;

import java.util.ArrayList;

public class ProdutoService {

    // Atributos
    private ProdutoDao produtoDao = new ProdutoDao();

    // Construtor
    public ProdutoService() {

    }

    // Métodos
    public void adicionarProduto(IProduto produto) {
        produtoDao.adicionarProduto(produto);
    }

    public void removerProduto(IProduto produto) {
        produtoDao.removerProduto(produto);
    }

    public ArrayList<IProduto> listarProdutos() {
        return produtoDao.listarProdutos();
    }

    // CALCULA O PREÇO TOTAL DA LISTA DE COMPRAS
    public double calcularTotal() {
        double preco = 0.0;

        if(!produtoDao.listarProdutos().isEmpty()) {
            for(IProduto produto : produtoDao.listarProdutos()) {
                preco += produto.getPreco();
            }
        }

        return preco;
    }
}
