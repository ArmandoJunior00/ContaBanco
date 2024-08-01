import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Permita que os dados sejam inseridos via terminal
        // numero, agencia, nome do cliente, saldo
        // resultado :Olá [Nome Cliente], obrigado por criar uma conta em nosso banco,
        // sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está
        // disponível para saque.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Por favor, digite o número da conta: ");
        int numConta = scanner.nextInt();
        System.out.print("Por favor, digite o número da Agência: ");
        String numAgencia = scanner.next();
        System.out.print("Por favor, digite seu saldo: ");
        float saldo = scanner.nextFloat();

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + numAgencia + " conta " + numConta + " e seu salado " + saldo + " já esta disponível para saque.");
    }
}
