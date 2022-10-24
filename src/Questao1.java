import java.util.Scanner;

public class Questao1 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Olá! Vou te mostrar a tabuada de um número inteiro que você digitar!");
        System.out.print("Por favor, digite um número: ");
        int n = input.nextInt();

        System.out.println("A tabuada do número " + n + " é: ");

        for (int i = 1; i <= 10; i = i + 1) {
            int produto = n*i;
            System.out.println(n + " * " + i + " = " + produto);
        }
    }
}
