import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numero;
        String agencia = "067-8";
        String nomeCliente = "MARIO ANDRADE";
        double saldo = 237.48;

        Scanner sc = new Scanner(System.in);

        System.out.println(" Por favor, digite o numero da agencia!");
        numero = sc.nextInt();

        System.out.println("Olá " + nomeCliente + " Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + "," + " conta 10" + numero + " e seu saldo de: " + saldo + " já está dosponível para saque");

        sc.close();
    }
}
