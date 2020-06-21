package conceitosGerais;

public class Desconto {

   public double aplicarDescontaNoTotalDaCompra(double valorDaCompra,int tipoDeCliente){
        double valorTotalComDesconto=0;

        switch (tipoDeCliente) {
            case 1:
                if (valorDaCompra >= 1000) {
                    valorTotalComDesconto =  valorDaCompra * 0.85;
                } else if (valorDaCompra >= 300 ) {
                    valorTotalComDesconto = valorDaCompra * 0.95;

                } else {
                    valorTotalComDesconto = valorDaCompra;
                }
                break;
            case 2:
                if (valorDaCompra >= 1000) {
                    valorTotalComDesconto = valorDaCompra * 0.75 ;
                } else if (valorDaCompra >= 300 ) {
                    valorTotalComDesconto = valorDaCompra * 0.90 ;
                } else {
                    valorTotalComDesconto = valorDaCompra;
                }
                break;
        }

        return valorTotalComDesconto;
    }
}
