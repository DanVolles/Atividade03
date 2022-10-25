import java.util.Scanner;

// Essa resolução foi feita na tentativa de estudar arrays
public class Questao5 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Aqui vou dizer quantas pessoas, dentre 5, têm mais de 18 anos e quantas têm menos!");

        int[] idade = new int[5];

        // Ler as idades
        lerIdades(idade);
        // Contar elementos maiores que 18
        int contador = contarElementosMaioresQueDezoito (idade);
        // Mostrar saída
        System.out.printf("%d pessoas possuem mais que 18 anos.", contador);

    }

    private static int contarElementosMaioresQueDezoito(int[] idade) {
        int contador = 0;
        for (int i = 0; i < idade.length; i++) {
            if (idade[i] > 18) {
                contador++;
            }
        }
        return contador;
    }

    private static void lerIdades(int [] idade) {
        for (int i = 1; i < idade.length; i++) {
            System.out.printf("Digite a %dª idade: ", i);
            idade [i] = input.nextInt();
        }
    }
}
class Q5Variacao {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int qtMaior = 0;
        int qtMenor = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite a idade");
            int idade = input.nextInt();
            if (idade >= 18) {
                qtMaior++;
            } else {
                qtMenor++;
            }
            System.out.printf("%s têm mais que 18 anos%n", qtMaior);
            System.out.printf("%s têm menos que 18 anos%n", qtMenor);
        }
    }
}