import java.util.Scanner;

public class VerificarNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o número da conta:");
            String numeroConta = scanner.nextLine();
            verificarNumeroConta(numeroConta);
            System.out.println("Número de conta válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage()); 
        } finally {
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) { 
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("O número da conta deve ter exatamente 8 dígitos.");
        }
    }
}
