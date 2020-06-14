package Exercicio4;

import java.util.Scanner;

public class ExercicioQuatro {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("digite seu nome");
        String nome = ler.nextLine();

        System.out.println("digite sua idade");
        int idade = ler.nextInt();


        if (idade<18){
            System.out.println(nome + " você é menor de idade ");
        }else {
            System.out.println(nome + " você é maior de idade ");
        }









    }}
