import java.util.Scanner;

public class VerificacaoChequeEspecial { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        double saldo = scanner.nextDouble(); 
        double saque = scanner.nextDouble(); 
        double limiteChequeEspecial = 500; 

        // Verifica se o saque não ultrapassa o saldo disponível na conta
        if (saque <= saldo) {
            System.out.println("Transação realizada com sucesso.");
        }
        // Verifica se o saque ultrapassa o saldo disponível, mas não ultrapassa o limite do cheque especial
        else if (saque > saldo && saque <= saldo + limiteChequeEspecial) {
            System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
        }
        // Se o saque ultrapassar tanto o saldo disponível quanto o limite do cheque especial
        else {
            System.out.println("Transação não realizada. Limite do cheque especial excedido.");
        }
        
        // Fechamos o objeto Scanner para liberar os recursos
        scanner.close(); 
    }
}
