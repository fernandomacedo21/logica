package estruturaRepeticao.exercicio3;

public class ExercicioTres {
    public static void main(String[] args) {
        for (int tabuada=1;tabuada<=10;tabuada=tabuada+1){
            System.out.println("");
            System.out.println("calculando a tabuada do "+ tabuada);

            for (int numero=1;numero<=10;numero=numero+1){
                System.out.println(tabuada+ "x" +numero+ "="+ (tabuada*numero));
            }

        }
    }
}
