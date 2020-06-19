package estruturaRepeticao.exercicio4;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do aluno : ");
        String nomeAluno=ler.nextLine();

        double notaTotal = 0;
        double media = 0;

        for (int bimestre=1;bimestre<=4;bimestre=bimestre+1){
            System.out.println("Digite a nota do "+ bimestre+" bimestre");
            notaTotal=notaTotal + ler.nextDouble();
            media=notaTotal/bimestre;
        }
        System.out.println("O aluno "+nomeAluno+" teve a média de "+ media);
    }
}
