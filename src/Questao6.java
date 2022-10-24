import java.util.Scanner;

public class Questao6 {

    static Scanner input = new Scanner(System.in);
    public static void main (String[] args) {

        System.out.println("Aqui vamos calcular o somatório e a média entre 5 números!\n" +
                "Por favor: ");

        System.out.print ("Digite o primeiro número: ");
        int a = input.nextInt();
        System.out.print ("Digite o segundo número: ");
        int b = input.nextInt();
        System.out.print ("Digite o terceiro número: ");
        int c = input.nextInt();
        System.out.print ("Digite o quarto número: ");
        int d = input.nextInt();
        System.out.print ("Digite o quinto número: ");
        int e = input.nextInt();

        int maior = greater (a, b, c, d, e);
        System.out.println ("O maior dos números é: " + maior);

        int menor = smaller (a, b, c, d, e);
        System.out.println ("O menor dos números é: " + menor);

        int soma = sum (a, b, c, d, e);
        System.out.println ("A soma entre os números é: " + soma);

        int media = average (a, b, c, d, e);
        System.out.println ("A média entre os números é: " + media);
    }

    public static int greater (int a, int b, int c, int d, int e) {
        return Math.max(Math.max(Math.max(Math.max(a,b),c),d),e);
    }

    public static int smaller (int a, int b, int c, int d, int e){
        return Math.min(Math.min(Math.min(Math.min(a,b),c),d),e);
    }

    public static int sum (int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    public static int average (int a, int b, int c, int d, int e) {
        return (a + b + c + d + e)/5;
    }

}
