import java.util.Scanner; // Importando a biblioteca de entarda de dados
public class Main{ // uma clase principal do programa
    public static void main(String [] args){ //
        int numero1, numero2; // variavel inteiro
        float media; // variavel ponto flutuantes
        Scanner lendoDados = new Scanner(System.in); // criando uma entrada de dados

        System.out.println("Hello World!"); // escrevendo na tela
        System.out.println("Bem-vindo ao Java!"); // escrevendo na tela

        System.out.print("Digita o primeiro numero: "); // interagindo com usuario
        numero1 = lendoDados.nextInt(); // comando de entrada de dados

        System.out.print("Digite o segundo numero: ");
        numero2 = lendoDados.nextInt();

        media = (float)(numero1 + numero2) / 2; // mostrando a soma e a media 5

        System.out.println("A media do numero " + numero1 +  " e  numero " + numero2 + " eh " + media);
        lendoDados.close();
    }
}