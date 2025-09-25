package Arquitetura.Views;

import Arquitetura.Models.Eletronico;
import Arquitetura.Models.Vestuario;
import Arquitetura.Utilidades.Ferramentas;

public class menuVestuario {

    // Métodos

    // ------ MENU PARA ADICIONAR VESTUÁRIO ------ //
    public static Vestuario criarVestuario() {

        // Variáveis locais
        double tamanhoRoupa;
        String nome;
        double preco;

        // Menu
        System.out.println("==============");
        System.out.println("MENU VESTUÁRIO");
        System.out.println("==============");

        System.out.println(); // Pula linha

        System.out.print("Digite o nome do vestuário: ");
        nome = Ferramentas.lString();

        System.out.print("Digite o preço do vestuário: ");
        preco = Ferramentas.lDouble();

        System.out.print("Digite o tamanho do vestuário: ");
        tamanhoRoupa = Ferramentas.lDouble();

        Ferramentas.limpaTerminal();

        return new Vestuario(nome, preco, tamanhoRoupa); // Retorna novo objeto vestuário
    }
}
