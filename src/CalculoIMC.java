import java.util.Scanner;
public class CalculoIMC {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double M, A, IMC;
        System.out.print("Massa (Kg): ");
        M = scanner.nextDouble();

        System.out.print("Altura (m): ");
        A = scanner.nextDouble();

        IMC = M / Math.pow(A, 2);

        System.out.printf("IMC: %.2f%n", IMC);

        if(IMC < 17){
            System.out.println("Muito abaixo do Peso");
        } else if ((IMC >= 17) && (IMC < 18.5)) {
            System.out.println ("Abaixo do Peso");
        } else if ((IMC >= 18.5) && (IMC < 25)){
            System.out.println("Peso ideal");
        } else if ((IMC >= 25) && (IMC < 30)) {
            System.out.println("Sobrepeso");
        } else if ((IMC >= 30) && (IMC < 35)) {
            System.out.println("Obesidade");
        } else if ((IMC >= 35) && (IMC < 40)) {
            System.out.println("Obesidade Severa");
        }else{
            System.out.println("Obesidade Morbida");
        }
    }
}
