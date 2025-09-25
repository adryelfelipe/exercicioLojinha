package Arquitetura.Views;

import Arquitetura.Utilidades.Ferramentas;

public class menuInicial {

    // Métodos

    // ------ MENU INICIAL ------ //
    public static void menu() {
        System.out.println("============");
        System.out.println("MENU INICIAL");
        System.out.println("============");

        System.out.println();

        System.out.println("[1] - Adicionar Eletronico");
        System.out.println("[2] - Adicionar Vestuario");
        System.out.println("Escolha sua opção: ");
        int op = Ferramentas.lInteiro();

        switch(op) {
            case 1 -> {}// chama menuEletronico
            case 2 -> {}// chama menuVestuario;
        }
    }
}
