import java.util.Scanner;

public class exer07 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de 350ml: ");
        int qtd350 = sc.nextInt();

        System.out.print("Quantidade de 600ml: ");
        int qtd600 = sc.nextInt();

        System.out.print("Quantidade de 2L: ");
        int qtd2L = sc.nextInt();

        double litros = qtd350 * 0.35 + qtd600 * 0.6 + qtd2L * 2.0;

        System.out.printf("O cliente comprou ao total %.2f litros.\n", litros);

        sc.close();
    }
}
