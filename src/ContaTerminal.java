import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
  
        System.out.println("Escreva o número da conta: ");
        int Numero = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Escreva o código da Agência: ");
        String Agencia = scanner.nextLine();

        System.out.println("Escreva o nome do cliente: ");
        String NomeCliente = scanner.nextLine();

        System.out.println("Escreva o valor do saldo: ");
        double Saldo = scanner.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque");
    }
}
