package conceitosGerais;

public class Calculadora {

    public double soma(int n1,int n2){
        return n1+n2;
    }
    public double subtracao(int n1,int n2){
        return n1-n2;
    }
    public double multiplicacao(int n1,int n2){
        return n1*n2;
    }
    public double divisao(int n1,int n2){
        return n1/n2;
    }

    public void imprimeResultado(double resultado) {
        System.out.println("Imprimindo resultado: "+ resultado);
    }

}
