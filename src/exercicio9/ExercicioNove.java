package exercicio9;

import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua cor favorita: ");
        String cor =ler.nextLine();

        switch (cor.toLowerCase()) {
            case "amarelo":
                System.out.println("Sua cor favorita em inglês é: Yellow");
                break;
            case "rosa":
                System.out.println("Sua cor favorita em inglês é: Pink");
                break;
            case "preto":
                System.out.println("Sua cor favorita em inglês é: Black");
                break;
            case "marrom":
                System.out.println("Sua cor favorita em inglês é: Brown");
                break;
            case "azul":
                System.out.println("Sua cor favorita em inglês é: Blue");
                break;
            case "verde":
                System.out.println("Sua cor favorita em inglês é: Green");
                break;
            case "roxo":
                System.out.println("Sua cor favorita em inglês é: Purple");
                break;
            case "laranja":
                System.out.println("Sua cor favorita em inglês é: Orange");
                break;
            case "branco":
                System.out.println("Sua cor favorita em inglês é: White");
                break;
            case "vermelho":
                System.out.println("Sua cor favorita em inglês é: Red");
                break;
            default:
                System.out.println("Não consegui encontrar sua cor");
        }
    }
}
