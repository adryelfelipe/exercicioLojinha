package Arquitetura.Views;

import Arquitetura.Daos.ProdutoDao;
import Arquitetura.Models.Eletronico;
import Arquitetura.Models.IProduto;
import Arquitetura.Models.Vestuario;
import Arquitetura.Services.ProdutoService;
import Arquitetura.Utilidades.Ferramentas;

public class menuProdutos {

    // Métodos
    public static void listaProdutos(ProdutoService produtoService) {
        System.out.println("======================");
        System.out.println("MENU LISTA DE PRODUTOS");
        System.out.println("======================");

        System.out.println();

        for(IProduto produto : produtoService.listarProdutos()) {
                System.out.print("NOME: " + produto.getNome() + " // PREÇO: R$" + produto.getPreco());
                if(produto instanceof Eletronico) {
                    System.out.println(" // GARANTIA: " + ((Eletronico) produto).getGarantiaMeses());
                } else {
                    System.out.println(" // TAMANHO: " + ((Vestuario) produto).getTamanhoRoupa());
                }
        }

        System.out.println("PREÇO TOTAL: R$" + produtoService.calcularTotal());

        Ferramentas.Delay(2500);

        Ferramentas.limpaTerminal();
    }
}
