import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = sc.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = sc.next();

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura");
        double altura = sc.nextDouble();

        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " cm ");
        sc.close();
    }
  
    }

