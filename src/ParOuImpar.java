import java.util.Scanner;
public class ParOuImpar {
    record ImparOuPar(int Numero1){}
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = scanner.nextInt();
        ImparOuPar a1 = new ImparOuPar(n);

        //a1.Numero1 = scanner.nextInt();

        if(a1.Numero1 %2 ==0){
            System.out.println("O numero " + a1.Numero1 + " eh PAR");
        }else{
            System.out.println("O numero " + a1.Numero1 + " eh IMPAR");
        }
    }
}
