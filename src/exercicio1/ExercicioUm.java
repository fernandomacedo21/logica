package exercicio1;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {

        System.out.println("primeira mesagem em java");

        //lógico-verdadeiro ou falso,no Java é true ou false
        boolean valorBoolean=true;

        //inteiro
        //Abrange de -128 a 127
        byte valorByte=127;
        //Abrange de -32768 á 32767
        short valorShort=5;
        //Abrange de -2147483648 á 2147483647
        int valorInt=5;
        //Abrange de -2 elevado á 65 até 2 elevado á 63 -1
        long valorLong=5;

        //Ponto Flutuante
        //Abrange de 1.40239846 elevado á -45 até 3.40282347 elevado á 38
        float valorFloat=5;
        //Abrange de 4.94065645841246544 elevado á -324 até 1.7976931348623157 elevado á 308
        double valorDouble=5;

        //Caractere
        //Pode armazenar um caractere unicode ou um inteiro entre 0 e 65535
        char valorChar=5;


        System.out.println("valorDouble é igual a "+valorDouble);
        System.out.println("valorFloat é igual a "+valorFloat);
        System.out.println("valorInt é igual a "+valorInt);
        System.out.println("valorChar é igual a "+valorChar);
        System.out.println("valorBoolean é igual a "+valorBoolean);
        System.out.println("é valorByte igual a "+valorByte);
        System.out.println("é valorLong igual a "+valorLong);

    }
}
