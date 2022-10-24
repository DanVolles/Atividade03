import java.util.Scanner;

public class Menu {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String selecao = "";
        while (!selecao.equals("x")) {
            System.out.println("Seja bem vindo à resolução da atividade 3!\n" +
                    "Por favor, digite o número da questão que você deseja executar:");

            System.out.println(
                    """
                            a) Questão 1
                            b) Questão 2
                            c) Questão 3
                            d) Questão 4
                            e) Questão 5
                            f) Questão 6
                            x) Para retornar""");

            selecao = input.nextLine();

            switch (selecao) {
                case "a" -> {
                    System.out.println(" -- Questão 01 -- ");
                    Questao1.main(args);
                }
                case "b" -> {
                    System.out.println(" -- Questão 02 -- ");
                    Questao2.main(args);
                }
                case "c" -> {
                    System.out.println(" -- Questão 03 -- ");
                    Questao3.main(args);
                }
                case "d" -> {
                    System.out.println(" -- Questão 04 -- ");
                    Questao4.main(args);
                }
                case "e" -> {
                    System.out.println(" -- Questão 05 -- ");
                    Questao5.main(args);
                }
                case "f" -> {
                    System.out.println(" -- Questão 06 -- ");
                    Questao6.main(args);
                }
                default -> {
                }
            }
        }
    }
}
