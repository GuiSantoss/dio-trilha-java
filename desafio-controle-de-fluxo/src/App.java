import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        while (true) {
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double adicionarSaldo = scanner.nextDouble();
                    saldo += adicionarSaldo;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double sacarSaldo = scanner.nextDouble();
                    if (sacarSaldo > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= sacarSaldo;
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
