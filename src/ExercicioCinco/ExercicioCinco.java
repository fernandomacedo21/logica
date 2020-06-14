package ExercicioCinco;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("digite um numero");

        int numero = ler.nextInt();

        System.out.println("Seu número é "+ numero);

        int resto = numero%2;

        if (resto==1){
            System.out.println("Seu número é impar ");
        }else {
            System.out.println("Seu número é par ");
        }


    }
}
