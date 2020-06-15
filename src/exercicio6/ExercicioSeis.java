package exercicio6;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("digite quantos passos você percorreu: ");

        int passos = ler.nextInt();

        System.out.println("Digite quantos ml's de água vc tomou: ");

        int agua = ler.nextInt();

        if (passos>1000 && agua>=2000) {
            System.out.println("Você está saudável ");
        }else {
            System.out.println("Você precisa melhorar seus hábitos ");
        }

    }
}
