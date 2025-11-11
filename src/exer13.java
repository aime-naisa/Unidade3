import java.util.Scanner;

public class exer13 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        System.out.print("Comprimento: ");
        double comprimento = sc.nextDouble();

        double area = altura * comprimento;
        int azulejosPorMetro = 9;
        double custoAzulejo = 12.5;

        double totalAzulejos = area * azulejosPorMetro;
        double valorFinal = totalAzulejos * custoAzulejo;

        System.out.printf("O valor final é R$ %.2f\n", valorFinal);

        sc.close();
    }
}
