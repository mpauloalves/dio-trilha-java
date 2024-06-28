import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitação dos dados via terminal
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.print("Agora, digite o número da Conta: ");
        numeroConta = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Informe o saldo da conta: ");
        saldo = scanner.nextDouble();

        // Exibição da mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo é R$" + saldo);
        System.out.println("Seu saldo já está disponível para saque.");

       
        scanner.close();
    }
}
