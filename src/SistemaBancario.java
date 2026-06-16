import java.util.Scanner;
public class SistemaBancario {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("   SISTEMAS BANCARIO  TECNOLOGIA  ");
        System.out.println("===============================");

        //Criando Variavel
        String nome, CPF;
        int opcao = 0;
        double Depositar, saldo, sacar;

        //Criando conta
        System.out.println("CRIAR CONTA");
        System.out.print("Nome: ");
        nome = scanner.nextLine();

        System.out.print("CPF: ");
        CPF = scanner.nextLine();

        System.out.print("Quantos dinheiro tem na conta? R$" );
        saldo = scanner.nextDouble();


        do{
            System.out.println("[1] - Consulta saldo");
            System.out.println("[2] - Depositar");
            System.out.println("[3] - Sacar");
            System.out.println("[4] - Sair");
            System.out.print("Escolha uma opção:");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Consultando saldo... R$" + saldo);
                    break;
                case 2:
                    System.out.print("Qual o valor? R$");
                    Depositar = scanner.nextDouble();

                    System.out.println("Depositado R$" + Depositar);
                    System.out.println("Saldo final R$" + (saldo + Depositar));
                    break;
                case 3:
                    System.out.print("Quantos quer sacar? R$");
                    sacar = scanner.nextDouble();
                    System.out.println("Sacando R$" + sacar);
                    System.out.println("Saldo final R$" + (saldo - sacar));
                    break;
                case 4:
                    System.out.println("Saindo...");
                    System.out.println("Volte sempre :)");
                    break;
                default:
                    System.out.println("Procure outros operadoes que possue uma nota de R$50, R$20, R$10, R$ 5, R$2");
            }
        }while(opcao != 4);
    }
}
