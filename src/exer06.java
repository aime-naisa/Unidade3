import java.util.Scanner;

public class exer06 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o peso do prato em quilos: ");
        double peso = sc.nextDouble();

        double precoPorQuilo = 25.0;
        double valor = peso * precoPorQuilo;

        System.out.printf("O valor do prato do cliente é R$ %.2f\n", valor);

        sc.close();
    }
}
