package exercicio2;

public class ExercicioDois {
    public static void main(String[] args) {
        //Para operadores E usamos &&
        System.out.println("O resultado de false e false é: "+(false && false));
        System.out.println("O Resultado de false e true é: "+(false && true));
        System.out.println("O Resultado de true e true é: "+(true && true));

        System.out.println("");
        System.out.println("");

        //Para operadores OU usamos ||
        System.out.println("O Resiltado de false ou false é: "+(false || false));
        System.out.println("O Resultado de false ou true é: "+(false || true));
        System.out.println("O Resultado de true ou true é: "+(true || true));

        System.out.println("");
        System.out.println("");

        //operadores relacionais

        //variaveis para exemplo
        int numero1=10;
        int numero2=5;

        //Para indicar se uma variavel é maior que o outra usamos > , exemplo
        System.out.println("O Numero 1 é maior que o numero 2? "+(numero1>numero2));

        //para indicar se uma variável é maior ou igual a outra usamos >=, exemplo:
        System.out.println("O numero 1 é maior ou igual ao numero 2? "+(numero1>=numero2));

        //para indicar se uma variavel é menor que outra usamos < exemplo:
        System.out.println("O numero 1 é menor que o numero 2? "+(numero1<numero2));

        //para indicar se uma variável é menor ou igual a outra usamos <= exemplo:
        System.out.println("O numero 1 é menor ou igual ao numero 2? "+(numero1<=numero2));

        System.out.println("");
        System.out.println("");

        //Operadores de Igualdade

        //Quando queremos verificar se uma variável é igual a outra,usamos ==, exemplo:
        System.out.println("O numero 1 é igual ao numero 2: "+(numero1 == numero2));

        //Quando queremos verificar se uma variável é diferente de outra usamos !=, exemplo:
        System.out.println("O numero 1 é diferente ao numero 2: "+(numero1 != numero2));

        System.out.println("");
        System.out.println("");

        //Operadores de Incremento e Decremento

        //Para Incrementar em uma variável numérica usamos ++, exemplo:
        numero2++;
        System.out.println("Ao incrementar o valor é "+numero2);

        //Para Decrementar em uma variável numérica usamos --, exemplo:
       numero1--;
        System.out.println("Ao Decrementar o valor é "+numero1);

        System.out.println("");
        System.out.println("");

        //Operadores Aritméticos

        //Operador para adição + , exemplo:
        System.out.println("A soma do numero 1 com o numero 2 é = "+(numero1+numero2));

        //Operador para subtraçõa - , exemplo:
        System.out.println("A subtração do numero 1 com o numero 2 é = "+(numero1-numero2));

        //Operador para multiplicação * , exemplo:
        System.out.println("A multiplicação do numero 1 com o numero 2 é = "+(numero1*numero2));

        //Operador para divisão / , exemplo:
        System.out.println("A divisão do numero 1 com o numero 2 é = "+(numero1/numero2));

        //Operador para resto % , exemplo:
        System.out.println("A resto do numero 1 com o numero 2 é = "+(numero1%numero2));


    }
}
