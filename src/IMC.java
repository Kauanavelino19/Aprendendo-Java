import java.util.Scanner;
import java.lang.Math; //Importando a biblioteca de potenciação
public class IMC {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double M, A, IMC;

        System.out.print("Massa (Kg): ");
        M = scanner.nextDouble();

        System.out.print("Altura (m): ");
        A = scanner.nextDouble();

        IMC = M / Math.pow(A,2);

        System.out.printf("IMC: %.2f%n",  IMC);

        if((IMC >= 18.5) && (IMC < 25)){
           System.out.print("Parabens! Voce esta no seu peso ideal");
        } else{
            System.out.print("Voce nao esta na faixa  de peso ideal");
        }
    }
}
