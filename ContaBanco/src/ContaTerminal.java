import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Random random = new Random();

        System.out.println("Por favor, digite seu nome e sobrenome!");
        String nomeCompleto = sc.nextLine();

        System.out.println("Agora, digite o número da Conta!");
        System.out.print("Conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Para finalizar, digite o número da Agência!");
        System.out.print("Agencia: ");
        String numeroAgencia = sc.next();

        float saldo = 1000.0f + random.nextFloat() * (10000.0f - 1000.0f);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.%n", nomeCompleto, numeroAgencia, numeroConta, saldo);

        sc.close();
    }
}
