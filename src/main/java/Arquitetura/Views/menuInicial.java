package Arquitetura.Views;

import Arquitetura.Daos.ProdutoDao;
import Arquitetura.Utilidades.Ferramentas;

public class menuInicial {

    // Atributos
    private static ProdutoDao produtoDao = new ProdutoDao();

    // Métodos

    // ------ MENU INICIAL ------ //
    public static void menu() {
        System.out.println("============");
        System.out.println("MENU INICIAL");
        System.out.println("============");

        System.out.println();

        System.out.println("[1] - Adicionar Eletronico");
        System.out.println("[2] - Adicionar Vestuario");
        System.out.print("Escolha sua opção: ");
        int op = Ferramentas.lInteiro();

        Ferramentas.limpaTerminal();

        switch(op) {
            case 1 -> {
                produtoDao.adicionarProduto(menuEletronico.criarEletronico());
            }

            case 2 -> {
                produtoDao.adicionarProduto(menuVestuario.criarVestuario());
            }
        }
    }
}
