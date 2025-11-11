import java.util.Scanner;

public class exer04 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10;

        System.out.printf("A média ponderada é: %.2f\n", media);

        sc.close();
    }
}
