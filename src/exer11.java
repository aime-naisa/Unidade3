import java.util.Scanner;

public class exer11 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em °C: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.printf("%.2f\n", fahrenheit);

        sc.close();
    }
}
