import java.util.Random;
import java.util.Scanner;

public class Lotofacil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int option;
        do {
            System.out.println("**************************");
            System.out.println("Menu LOTOFÁCIL:");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair");
            System.out.println("**************************");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    play0to100(scanner, random);
                    break;
                case 2:
                    playAToZ(scanner);
                    break;
                case 3:
                    playParImpar(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (option != 0);

        scanner.close();
    }

    public static void play0to100(Scanner scanner, Random random) {
        System.out.print("Digite um número de 0 a 100: ");
        int userNumber = scanner.nextInt();

        if (userNumber < 0 || userNumber > 100) {
            System.out.println("Aposta inválida.");
            return;
        }

        int randomNumber = random.nextInt(101);
        System.out.println("Número sorteado: " + randomNumber);

        if (userNumber == randomNumber) {
            System.out.println("Você ganhou R$ 1.000,00 reais.");
        } else {
            System.out.println("Que pena! O número sorteado foi: " + randomNumber + ".");
        }
    }

    public static void playAToZ(Scanner scanner) {
        System.out.print("Digite uma letra de A à Z: ");
        char userChar = Character.toUpperCase(scanner.next().charAt(0));

        if (!Character.isLetter(userChar)) {
            System.out.println("Aposta inválida.");
            return;
        }

        char winningChar = 'J'; // Exemplo de letra premiada

        System.out.println("Letra sorteada: " + winningChar);

        if (userChar == winningChar) {
            System.out.println("Você ganhou R$ 500,00 reais.");
        } else {
            System.out.println("Que pena! A letra sorteada foi: " + winningChar + ".");
        }
    }

    public static void playParImpar(Scanner scanner) {
        System.out.print("Digite um número inteiro: ");
        int userNumber = scanner.nextInt();

        if (userNumber % 2 == 0) {
            System.out.println("Você ganhou R$ 100,00 reais.");
        } else {
            System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
        }
    }
}