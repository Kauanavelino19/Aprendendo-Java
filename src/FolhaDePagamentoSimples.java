import java.util.Scanner;

public class FolhaDePagamentoSimples {

    public static void main(String[] args){

       Scanner lendoDados = new Scanner(System.in);
       String nome;
       int horariosTrabalhada, valorHoras;

       System.out.print("Digite o nome do funcionario: ");
       nome = lendoDados.nextLine();

       System.out.print("Digite o valor da horas dele: ");
       valorHoras = lendoDados.nextInt();

       System.out.print("Quantas horas ele trabalhou: ");
       horariosTrabalhada = lendoDados.nextInt();

       int salarioBruto = valorHoras * horariosTrabalhada;
       double desconto = salarioBruto * 0.08;
       double bonus = salarioBruto * 0.05;

       double salarioLiquido = salarioBruto - desconto + bonus;

       System.out.println("Funcionario: " + nome);

       System.out.println("Salario Bruto: " + salarioBruto);

       System.out.println("Desconto: " + desconto);

       System.out.println("Bunus: " + bonus);

       System.out.println("Salario Liquido: " + salarioLiquido);

    }

}
