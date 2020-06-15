package exercicio7;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");

        String nome =ler.nextLine();

        System.out.println("O Tamanho do seu nome é: " + nome.length());
        System.out.println("");

        System.out.println("O seu nome possui a letra a? Resposta: " + nome.contains("a"));
        System.out.println("");

        System.out.println("A letra a está na posição " + nome.indexOf("a"));
        System.out.println("");

        String nomenovo = nome.replaceAll("a", "u");
        System.out.println("Substituindo as vogais a por u " + nome.replaceAll("a", "u"));
        System.out.println("");

        System.out.println("Pegando as 5 primeiras letras " + nome.substring(0 ,5));
        System.out.println("");

        System.out.println("Tudo em letra   MAIUSCULA  " + nome.toUpperCase());
        System.out.println("");

        System.out.println("Separando o nome em lista  " + nome.split(" "));
        System.out.println("");

        System.out.println("");



    }
}
