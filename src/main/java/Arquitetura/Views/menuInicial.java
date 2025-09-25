package Arquitetura.Views;

import Arquitetura.Daos.ProdutoDao;
import Arquitetura.Services.ProdutoService;
import Arquitetura.Utilidades.Ferramentas;

public class menuInicial {

    // Atributos
    private static ProdutoService produtoService = new ProdutoService();

    // Métodos

    // ------ MENU INICIAL ------ //
    public static void menu() {
        boolean continuar = true;

        while (continuar) {

            System.out.println("============");
            System.out.println("MENU INICIAL");
            System.out.println("============");

            System.out.println();

            System.out.println("[1] - Adicionar Eletronico");
            System.out.println("[2] - Adicionar Vestuario");
            System.out.println("[3] - Visualizar Produtos");
            System.out.println("[4] - Sair");
            System.out.print("Escolha sua opção: ");
            int op = Ferramentas.lInteiro();

            Ferramentas.limpaTerminal();

            switch (op) {
                case 1 -> {
                    produtoService.adicionarProduto(menuEletronico.criarEletronico());
                }

                case 2 -> {
                    produtoService.adicionarProduto(menuVestuario.criarVestuario());
                }

                case 3 -> {
                    menuProdutos.listaProdutos(produtoService);
                }

                case 4 -> continuar = false;
            }
        }
    }
}
