import java.util.Scanner;

public class exer08 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor em dólares recebido pelo cliente: ");
        double dolares = sc.nextDouble();

        System.out.print("Cotação do dólar hoje: ");
        double cotacao = sc.nextDouble();

        double reais = dolares * cotacao;

        System.out.printf("O atendente deve devolver R$ %.2f para o cliente.\n", reais);

        sc.close();
    }
}
