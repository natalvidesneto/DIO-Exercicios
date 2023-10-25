import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Variáveis Numero, Agência, NomeCliente e Saldo
        int numero = 0;
        String agencia = "067-8";
        String nomeCliente = "";
        float saldo = 237.48f;

        System.out.println("\nInforme o número da Agencia!\nExemplo: 1021");//Exibi pergunta para o usuário
        numero = scanner.nextInt();//Armazena dado digitado 
        /*
         * Adicionando scanner.nextLine() logo após a leitura do inteiro, você garante que a quebra de linha seja consumida, e as próximas leituras funcionarão como esperado.
         */
        scanner.nextLine();
        System.out.println("\nNome de Usuário:\nSeu nome por exemplo");//Exibi pergunta para o usuário
        nomeCliente = scanner.nextLine();//Armazena dado digitado

        //Saída na tela
        System.out.println("\nOlá "+nomeCliente+", obrigado por criar uma conta em \nnosso banco, sua agência é "+agencia+",\nconta "+numero+" e seu saldo "+saldo+" \njá está disponível para saque.\n");
    }
}
