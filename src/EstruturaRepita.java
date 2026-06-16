import java.util.Scanner;
public class EstruturaRepita {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int N, S = 0;
        char Resp;
        //Treinando o do while (A estrutura repita )!
        do{
            System.out.print("Digite o valor: ");
            N = scanner.nextInt();
            S = S + N;

            System.out.print("Quer continuar? [S/N]");
            Resp = scanner.next().charAt(0);
        }while(Resp != 'N' && Resp != 'n');
        System.out.print("A soma de todos os valores e " + S);
    }
}
