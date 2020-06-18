package exercicio10;

import java.util.Scanner;



public class ExercicioDez {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Tipo de Cliente: ");
        System.out.println("[1] Cliente Normal");
        System.out.println("[2] Cliente Especial");
        int cliente =ler.nextInt();

        System.out.println("digite o valor de sua compra:");
        int compra = ler.nextInt();

        switch (cliente) {
            case 1:
                if (compra >= 1000) {
                    System.out.println(cliente + " Total com desconto é  " + compra * 0.85 + " reais");
                } else if (compra >= 300 ) {
                    System.out.println(cliente + " Total com desconto é " + compra * 0.95 + " reais");
                } else {
                    System.out.println(cliente + "Você não obteve desconto");
                }
                break;
            case 2:
                if (compra >= 1000) {
                    System.out.println(cliente + " Total com desconto é   " + compra * 0.75 + " reais");
                } else if (compra >= 300 ) {
                    System.out.println(cliente + " Total com desconto é  " + compra * 0.90 + " reais");
                } else {
                    System.out.println(cliente + "Você não obteve desconto");
                }
                break;

                default:
                System.out.println("Tipo de Cliente não encontrado");
        }

    }
}
