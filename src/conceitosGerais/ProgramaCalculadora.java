package conceitosGerais;

import java.util.Scanner;

public class ProgramaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        Scanner ler = new Scanner(System.in);

        //pede operação
        System.out.println("digite a operação a ser realizada ( + , - , / , *) ");
        String operacao = ler.nextLine();

        //pede n1
        System.out.println("Digite o pimeiro número: ");
        int primeiroNumero = ler.nextInt();

        //pede n2
        System.out.println("Digite o segundo número: ");
        int segundoNumero = ler.nextInt();

        double resultado = 0;

        switch (operacao) {
            case "+":
                resultado = calculadora.soma(primeiroNumero, segundoNumero);
                break;

            case "-":
                resultado = calculadora.subtracao(primeiroNumero, segundoNumero);
                break;

            case "*":
                resultado = calculadora.multiplicacao(primeiroNumero, segundoNumero);
                break;

            case "/":
                resultado = calculadora.divisao(primeiroNumero, segundoNumero);
                break;

            default:
                System.out.println("Não identificamos o formato de conta a realizar");

        }
        calculadora.imprimeResultado(resultado);

    }
}
