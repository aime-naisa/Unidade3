import java.util.Scanner;

public class exer05 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de frangos: ");
        int frangos = sc.nextInt();

        double custoPorFrango = 4.0 + 2 * 3.5;
        double gastoTotal = frangos * custoPorFrango;

        System.out.printf("O gasto total para marcar %d é R$ %.1f\n", frangos, gastoTotal);

        sc.close();
    }
}
