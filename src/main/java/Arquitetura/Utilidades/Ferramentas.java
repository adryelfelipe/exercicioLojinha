package Arquitetura.Utilidades;

import java.util.Scanner;

public class Ferramentas {

    // Atributos Estáticos
    private static Scanner ler = new Scanner(System.in);

    // Construtor privado
    private Ferramentas() {

    }

    // Métodos

    // ------ APLICA DELAY EM MILISEGUNDOS ------ //
    public void Delay(int ms) {
        try{Thread.sleep(ms);}catch(InterruptedException e){}
    }

    // ------ FAZ INPUT DE DOUBLE E RETORNA ------ //
    public double lDouble() {
        double num = ler.nextDouble();

        ler.nextLine(); // Esvazia o buffer

        return num;
    }

    // ------ FAZ INPUT DE STRING E RETORNA ------ //
    public String lString() {
        return ler.nextLine();
    }

    // ------ FAZ INPUT DE INTEIRO E RETORNA ------ //
    public int lInteiro() {
        int num = ler.nextInt();

        ler.nextLine(); // Esvazia o buffer

        return num;
    }
}
