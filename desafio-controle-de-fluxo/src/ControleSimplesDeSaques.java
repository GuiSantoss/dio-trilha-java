import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques até o limite diário
        for (double saques = 0; saques < limiteDiario; saques++) {
            // Solicita ao usuário o valor do saque
            System.out.println("Valor do saque:");
            double saque = scanner.nextDouble();        

            // Verifica se o valor do saque é zero, encerrando as transações
            if (saque <= 0) {
                System.out.println("Transações encerradas.");
                break; // Sai do loop
            } else if (saque <= limiteDiario) {
                // Se o valor do saque não ultrapassar o limite diário, subtrai o valor do saque do limite diário
                limiteDiario -= saque;
                // Informa que o saque foi realizado e mostra o limite restante
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            } else {
                // Se o valor do saque ultrapassar o limite diário, informa que não é possível realizar o saque
                System.out.println("Valor de saque excede o limite diário. Transação não realizada.");
                break;
            }
        }

        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close(); 
    }
}
