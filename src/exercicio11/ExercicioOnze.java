package exercicio11;

import java.util.Scanner;

public class ExercicioOnze {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a Sigla de seu estado: ");
        String estado =ler.nextLine();

        switch (estado.toLowerCase()) {
            case "ac":
                System.out.println("Estado do Acre, capital é Rio Branco, situado na Região Norte ");
                break;
            case "am":
                System.out.println("Estado do Amazonas, capital é Manaus, situada na Região Norte");
                break;
            case "rr":
                System.out.println("Estado de Roraima, capital é Boa Vista, situada na Região Norte");
                break;
            case "ro":
                System.out.println("Estado de Rondônia, capital é Porto Velho, situado na Região Norte");
                break;
            case "ap":
                System.out.println("Estado do Amapa, capital é Macapá, situada na Região Norte");
                break;
            case "pa":
                System.out.println("Estado do Pará, capital é Belém, situada na Região Norte");
                break;
            case "to":
                System.out.println("Estado do Tocantins, capital é Palmas, situada na Região Norte");
                break;
            case "ma":
                System.out.println("Estado do Maranhão, capital é São Luís, situado na Região Nordeste");
                break;
            case "pi":
                System.out.println("Estado do Piauí, capital é Teresina, situada na Região Nordeste");
                break;
            case "ce":
                System.out.println("Estado do Ceará, capital é Fortaleza, situada na Região Nordeste");
                break;
            case "rn":
                System.out.println("Estado do Rio Grande do Norte, capital é Natal, situado na Região Nordeste ");
                break;
            case "pb":
                System.out.println("Estado da Paraíba, capital é João Pessoa, situada na Região Nordeste");
                break;
            case "pe":
                System.out.println("Estado de Pernambuco, capital é Recife, situado na Região Nordeste");
                break;
            case "al":
                System.out.println("Estado de Alagoas, capital é Maceió, situado na Região Nordeste");
                break;
            case "se":
                System.out.println("Estado de Sergipe, capital é Aracajú, situada na Região Nordeste");
                break;
            case "ba":
                System.out.println("Estado da Bahia, capital é Salvador, situada na Região Nordeste");
                break;
            case "mt":
                System.out.println("Estado do Mato Grosso, capital é Cuiabá, situada na Região Centro-Oeste");
                break;
            case "go":
                System.out.println("Estado de Goiás, capital é Goiânia, situada na Região Centro-Oeste");
                break;
            case "ms":
                System.out.println("Estado de Mato Grosso do Sul, capital é Campo Grande, situada na Região Centro-Oeste");
                break;
            case "df":
                System.out.println("Estado do Distrito Federal, capital é Brasília, situada na Região Centro-Oeste");
                break;
            case "sp":
                System.out.println("Estado de São Paulo, capital é São Paulo, situado na Região Sudeste ");
                break;
            case "mg":
                System.out.println("Estado de Minas Gerais, capital é Belo Horizonte, situado na Região Sudeste");
                break;
            case "es":
                System.out.println("Estado de Espírito Santo, capital é Vitória, situada na Região Sudeste");
                break;
            case "rj":
                System.out.println("Estado do Rio De Janeiro, capital é Rio De Janeiro, situado na Região Sudeste");
                break;
            case "pr":
                System.out.println("Estado do Paraná, capital é Curitiba, situado na Região Sul");
                break;
            case "sc":
                System.out.println("Estado de Santa Catarina, capital é Florianópolis, situada na Região Sul");
                break;
            case "rs":
                System.out.println("Estado do Rio Grande do Sul, capital é Porto Alegre, situada na Região Sul");
                break;

            default:
                System.out.println("Não consegui encontrar seu estado");
        }
    }
}


