package exercicio8;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o mês do seu Nascimento: ");
        String mes =ler.nextLine();

        switch (mes.toLowerCase()){
            case "janeiro":
                System.out.println("Você nasceu no Verão");
                break;
            case "fevereiro":
                System.out.println("Você nasceu no Verão");
                break;
            case "março":
                System.out.println("Você nasceu no verão");
                break;
            case "abril":
                System.out.println("Você nasceu no Outono");
                break;
            case "maio":
                System.out.println("Você nasceu no Outono");
                break;
            case "junho":
                System.out.println("Você nasceu no Outono");
                break;
            case "julho":
                System.out.println("Você nasceu no Inverno");
                break;
            case "agosto":
                System.out.println("Você nasceu no Inverno");
                break;
            case "setembro":
                System.out.println("Você nasceu no Inverno");
                break;
            case "outubro":
                System.out.println("Você nasceu na Primavera");
                break;
            case "novembro":
                System.out.println("Você nasceu na Primavera");
                break;
            case "dezembro":
                System.out.println("Você nasceu na Primavera");
                break;
            default:
                System.out.println("Não identificamos o formato do mês corretamente");
        }

    }
}
