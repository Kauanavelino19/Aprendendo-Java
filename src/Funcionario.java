import java.util.Scanner;
public class Funcionario {
    public static void main(String[] args){
        String nome;
        int idade;
        double salarioMensal;
        char genero;
        boolean empregadoJava;

        Scanner lendoDados = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = lendoDados.nextLine();

        System.out.print("Digite sua idade: ");
        idade = lendoDados.nextInt();

        System.out.print("Qual é o salario : ");
        salarioMensal = lendoDados.nextDouble();

        lendoDados.nextLine();

        System.out.print("É masculino M ou feminino F: ");
        genero = lendoDados.nextLine().charAt(0);

        System.out.print("Está empregado: (true or false) ");
        empregadoJava = lendoDados.nextBoolean();

        System.out.println("O nome e: " + nome);

        System.out.println("A idade e: " + idade);

        System.out.println("O salario mensal e: R$" + salarioMensal);

        if(genero == 'M' || genero == 'm'){
            System.out.println("Homem ");
        }else if(genero == 'F' || genero == 'f'){
            System.out.println("Mulher ");
        }else{
            System.out.println("Genero invalido!!!");
        }
        if(empregadoJava) {
            System.out.println("Situação: Empregado");
        }else{
            System.out.println("Situação: Desempregado");
        }
    }

}
