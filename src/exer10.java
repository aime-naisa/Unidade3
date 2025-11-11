import java.util.Scanner;

public class exer10 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cateto oposto: ");
        double cateto1 = sc.nextDouble();

        System.out.print("Cateto adjacente: ");
        double cateto2 = sc.nextDouble();

        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);

        System.out.printf("A hipotenusa é: %.2f\n", hipotenusa);

        sc.close();
    }
}
