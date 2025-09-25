package Arquitetura.Views;

import Arquitetura.Daos.ProdutoDao;
import Arquitetura.Models.IProduto;
import Arquitetura.Services.ProdutoService;

public class menuProdutos {

    // Métodos
    public static void listaProdutos(ProdutoService produtoService) {
        System.out.println("======================");
        System.out.println("MENU LISTA DE PRODUTOS");
        System.out.println("======================");

        System.out.println();

        for(IProduto produto : produtoService.listarProdutos()) {
            System.out.println("NOME: " + produto.getNome() + " // PREÇO: R$" + produto.getPreco());
        }

        System.out.println("PREÇO TOTAL: R$" + produtoService.calcularTotal());
    }
}
