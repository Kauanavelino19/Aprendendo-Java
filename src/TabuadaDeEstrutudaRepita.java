import java.util.Scanner;
public class TabuadaDeEstrutudaRepita {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N, cont,calculo ,Resp;
        cont = 1;
        System.out.print("QUer ver a tabuada de qual numero? ");
        N = scanner.nextInt();
        do {
            calculo = N * cont;
            System.out.println(N + " * " + cont + " = " + calculo);
            cont++;

        }while(cont <= 10);
    }
}

