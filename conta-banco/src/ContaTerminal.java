import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Bem-vindo(a) ao Banco Continente! Para iniciar seu atendimento, por favor digite o número da sua agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o número da sua conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Agora, digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nome + ", obrigado por abrir uma conta no Banco Continente! Sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível.");

        scanner.close();
    }
}