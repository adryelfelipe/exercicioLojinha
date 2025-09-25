package Arquitetura.Views;

import Arquitetura.Models.Eletronico;
import Arquitetura.Utilidades.Ferramentas;

public class menuEletronico {

    // Métodos

    // ------ MENU PARA ADICIONAR ELETRONICO ------ //
    public static Eletronico criarEletronico() {

        // Variáveis locais
        int garantiaMeses;
        String nome;
        double preco;

        // Menu
        System.out.println("===============");
        System.out.println("MENU ELETRÔNICO");
        System.out.println("===============");

        System.out.println(); // Pula linha

        System.out.print("Digite o nome do eletrônico: ");
        nome = Ferramentas.lString();

        System.out.println("Digite o preço do eletrônico");
        preco = Ferramentas.lDouble();

        System.out.println("Digite o tempo de garantia em meses: ");
        garantiaMeses = Ferramentas.lInteiro();

        Ferramentas.limpaTerminal();

        return new Eletronico(nome, garantiaMeses, preco); // Retorna novo objeto eletrônico
    }
}
