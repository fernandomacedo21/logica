package exercicio12;

import java.util.Scanner;

public class ExercicioDoze {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua altura : ");
        double altura =ler.nextDouble();

        System.out.println("Digite seu peso : ");
        double peso = ler.nextDouble();


        double imc = peso / (altura*altura);
        System.out.println("IMC: "+ imc);

        if (imc < 16 ) {
            System.out.println("Muito abaixo do peso ");
        } else if (imc >= 17 && imc <18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >=18.5 && imc < 25){
            System.out.println("Peso Ideal");
        } else if (imc >=25 && imc < 30){
            System.out.println(" Sobre Peso ");
        } else if (imc >=30 && imc <35){
            System.out.println("Obesidade");
        } else if (imc >=35 && imc <40){
            System.out.println("Obesidade severa");
        } else {
            System.out.println("Obesidade Morbida");
        }
    }
}
