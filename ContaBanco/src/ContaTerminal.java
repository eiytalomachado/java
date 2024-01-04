import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        String numeroAgencia = scanner.next();

        scanner.nextLine();

        System.out.println("Por favor, digite o seu nome completo:");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo:");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá, " + nomeCompleto + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque!!!");

    }
}
