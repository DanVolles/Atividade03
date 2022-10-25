import java.util.Scanner;

public class Questao3 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Este programa vai te dizer todos os números inteiros entre dois inteiros!");

        System.out.println("Por favor, digite o primeiro número: ");
        int a = input.nextInt();

        System.out.println("Por favor, digite o segundo número: ");
        int b = input.nextInt();

        // Dá pra fazer com um só for, tentar depois
        if (a < b) {

            if ((a + 1) == b) {
                System.out.println("Não existem números inteiros entre " + a + " e " + b + " pois estes são vizinhos!");
            } else {
                for (int i = a + 1; i > a && i < b; i = i + 1) {
                    System.out.println(i);
                }
            }

        } else if (b < a) {

            if ((b + 1) == a) {
                System.out.println("Não existem números inteiros entre " + b + " e " + a + " pois estes são vizinhos!");
            } else {
                for (int i = b + 1; i > b && i < a; i = i + 1) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Os números são iguais!");
        }
    }
}