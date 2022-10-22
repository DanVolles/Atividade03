import java.util.Scanner;

public class Questao4 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        // Palavra secreta: Java-2022
        System.out.println("Você tem 5 tentativas para acertar a palavra secreta!\n" +
                "Que os jogos comecem!");

        int contar = 5;
        do {

            System.out.println("Digite a palavra secreta: ");
            String palavraSecreta = input.nextLine();

            contar = contar - 1;

            if (palavraSecreta.contentEquals("Java-2022")) {
                System.out.println("Parabéns! Você acertou a palavra secreta!");
                System.exit(0);
            } else {
                System.out.println("Essa não é a palavra secreta...\n" +
                        "Tente novamente!");
            }
        } while (contar > 0) ;
    }
}
