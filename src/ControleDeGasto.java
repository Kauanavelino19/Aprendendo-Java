import java.util.Scanner;
public class ControleDeGasto {
    public static void main(String[] args){
        //Controle de Gasto
        System.out.println("=======================");
        System.out.println("  CONTROLE DE GASTO  ");
        System.out.println("=======================");

        Scanner scanner = new Scanner(System.in);

        //CRIANDO VARIAVEL

        /*
            PENSANDO LOGICAMENTE

            Adicionar um gasto.
            Mostrar todos os gastos cadastrados.
            Mostrar o total gasto.
            Encerrar o programa.


        */
         String Nome, NomeGasto;
         int opcao = 0;
         double Salario, ValorGasto;

         System.out.print("Nome: ");
         Nome = scanner.nextLine();

         System.out.print("Salario: ");
         Salario = scanner.nextInt();

         do{
             System.out.println("[1] - Adicionar um gasto.");
             System.out.println("[2] - Mostrar todos os gastos cadastrados.");
             System.out.println("[3] - Mostrar o total gasto.");
             System.out.println("[4]- Encerrar o programa.");
             System.out.print("Escolhe uma opção: ");
             opcao = scanner.nextInt();
             switch (opcao){
                 case 1:
                     System.out.println("========================");

                     System.out.print("Qual é o nome do gasto? ");
                     NomeGasto = scanner.nextLine();

                     System.out.print("Qual é o valor do gasto? R$");
                     ValorGasto = scanner.nextDouble();

                     System.out.println("Adicionando gasto.....");
                     System.out.println("========================");
                     break;
                 case 2:
                     System.out.println("=============================");
                     System.out.println("Mostrando todos os gasto ...");
                     System.out.println("=============================");
                     break;
                 case 3:
                     System.out.println("=============================");
                     System.out.println("Mostrar o total do gasto ....");
                     System.out.println("=============================");
                     break;
                 case 4:
                     System.out.println("=============================");
                     System.out.println("Encerrando programa...");
                     System.out.print("=============================");
                     break;
                 default:
                     System.out.println("PROGRAMA ENCERRADO...");
                     System.out.println("VOLTE SEMPRE :)");


             }
         }while(opcao !=4);
    }
}
