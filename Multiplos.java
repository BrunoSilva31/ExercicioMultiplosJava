import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o primeiro número inteiro: ");
        int a = sc.nextInt();

        System.out.println("Escreva o segundo número inteiro: ");
        int b = sc.nextInt();

        if (a / b == 0) {
            System.out.println("Os números são múltiplos");
        } else {
            System.out.println("Os números não são múltiplos");
        }


        sc.close();
    }

}
