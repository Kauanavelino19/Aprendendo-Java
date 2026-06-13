import java.util.Scanner;
public class RegistroEmJava {
    record Pessoas(String Nome, int Idade, char Sexo){}
    public static void main(String[] args){
        String nome;
        int idade;
        char sexo;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do(a) aluno(a): ");
        nome = scanner.nextLine();

        System.out.print("Digite a idade do(a) aluno(a): ");
        idade = scanner.nextInt();

        System.out.print("Digite se o(a) eh Homem(M) ou Mulher(F)");
        sexo = scanner.next().charAt(0);

        Pessoas a1 = new Pessoas(nome, idade, sexo);

        System.out.println("Nome: " + a1.Nome());

        System.out.println("Idade: " + a1.Idade());

        System.out.println("Sexo: " +a1.Sexo());
    }
}
