package exercicio3;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("digite um numero");
        //Lendo o que foi digitado
        int numero = ler.nextInt();

        System.out.println("Seu número é "+ numero);

        int proximoDoNumeroDigitado = numero + 1;
        System.out.println("Seu proximo numero é "+ proximoDoNumeroDigitado);


        int anteriorDoNumeroDigitado = numero - 1;
        System.out.println("Seu numero anterior é "+ anteriorDoNumeroDigitado);

        System.out.println("A Soma do Numero anterior com o proximo é " + (proximoDoNumeroDigitado+anteriorDoNumeroDigitado));




    }
}