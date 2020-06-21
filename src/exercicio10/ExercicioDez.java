package exercicio10;

import conceitosGerais.Calculadora;
import conceitosGerais.Desconto;

import java.util.Scanner;



public class ExercicioDez {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Desconto desconto = new Desconto();

        System.out.println("Tipo de Cliente: ");
        System.out.println("[1] Cliente Normal");
        System.out.println("[2] Cliente Especial");
        int cliente =ler.nextInt();

        System.out.println("digite o valor de sua compra:");
        int compra = ler.nextInt();

        double resultado = desconto.aplicarDescontaNoTotalDaCompra(compra, cliente);

        System.out.println(cliente + " Total com desconto é  " + resultado + " reais");

    }
}
