import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String frase;
        int contador;

        System.out.println("""
                Olá! Eu sou o programa que o Harry Potter desejaria muito ter tido\s
                quando a Umbridge mandou ele escrever com aquela pena 'especial'...\s
                Vamos ensinar uma lição à ela e escrever 'Não devo contar mentiras' quantas\s
                vezes nós quisermos?
                """);

        System.out.println("Por favor, digite a frase que deve ser escrita: ");
        frase = input.next();

        System.out.println("Por favor, digite o número de vezes que a mensagem deve ser escrita: ");
        contador = input.nextInt();

        for (int i = 1; i <= contador; i = i + 1) {
            System.out.println(frase);
        }
    }
}
// Pq deu errado?
//    int repeticao = 1;
//
//        while (repeticao >= contador) {
//                System.out.println(frase);
//                repeticao = repeticao + 1;
//                }
