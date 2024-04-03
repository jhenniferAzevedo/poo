package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Para criar uma conta, por favor, informe o nome do titular da conta: ");
        String name = scanner.nextLine();

        System.out.println("Agora, informe o numero da conta bancaria: ");
        int number = scanner.nextInt();

        System.out.println("Então, digite o numero da agencia: ");
        String agency = scanner.next();
        scanner.nextLine();

        System.out.println("Por fim, diga-nos qual o saldo da conta: ");
        float balance = scanner.nextFloat();

        System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco. " +
                "Sua agência é %s, conta %d e seu saldo R$%.2f já está " +
                "disponível para saque!", name, agency, number, balance);
    }
}
