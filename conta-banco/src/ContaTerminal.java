import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela classe Scanner os valores digitados no terminal
        //Exibir a mensagem final
    
            Scanner scanner = new Scanner(System.in);

        System.out.print("Seja bem-vindo(a) ao Banco Continente. Para iniciar o atendimento, por favor digite o número da sua agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Agora digite o número da sua conta com dígito: ");
        String conta = scanner.nextLine();

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("E para finalizar, digite o seu saldo: ");
        String saldo = scanner.nextLine();

        System.out.println("Olá, " + nome + ", obrigado por abrir uma conta no Banco Continente! Sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível.");

        scanner.close();
    }
}
