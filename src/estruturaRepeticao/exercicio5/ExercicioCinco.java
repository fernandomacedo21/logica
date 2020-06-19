package estruturaRepeticao.exercicio5;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do aluno : ");
        String nomeAluno=ler.nextLine();

        System.out.println("Digite Quantas notas  : ");
        int quantidadeNotas=ler.nextInt();

        double notaTotal = 0;
        double media = 0;

        for (int notas=1;notas<=quantidadeNotas;notas=notas+1){
            System.out.println("Digite a nota do aluno:");
            notaTotal=notaTotal + ler.nextDouble();
            media=notaTotal/notas;

        }
        System.out.println("O aluno "+nomeAluno+" teve a média de "+ media);
    }
}