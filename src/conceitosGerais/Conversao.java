package conceitosGerais;

public class Conversao {
    public static void main(String[] args) {
        int numero1= 5;
        float numero2= numero1;
        System.out.println("Convertendo o numero " + numero1+" de int para float = "+numero2);

        String texto= "5";
        int numero3= Integer.parseInt(texto);
        System.out.println("Convertendo a String " + texto +" de String para int = "+numero3);

        int teste1 = 234567889;
        short teste2 = (short) teste1;
        System.out.println("Convertendo o numero " + teste1+" de int para short = "+teste2);

        short teste3 = 25678;
        int teste4 = teste3;
        System.out.println("Convertendo o numero " + teste3+" de short para int = "+teste4);

        //tipo primitivo
        double teste6 = 1.90;
        //tipo classe - objeto
        Double teste7 = 1.90;

        //tipo primitivo
        int teste8 = 9;
        //tipo classe - objeto
        Integer teste9=9;

        //tipo primitivo
        float teste10 = 7;
        //tipo classe - objeto
        Float teste11 = 7f;

        //tipo primitivo
        boolean teste12 = true;
        //tipo classe - objeto
        Boolean teste13= true;

        //tipo primitivo
        long teste14 = 3;
        //tipo classe - objeto
        Long teste15=9l;


    }
}
