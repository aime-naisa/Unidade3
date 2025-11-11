import java.util.Scanner;

public class exer09 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Raio: ");
        double raio = sc.nextDouble();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        double volume = Math.PI * raio * raio * altura;

        System.out.printf("O volume da lata de óleo é: %.2f\n", volume);

        sc.close();
    }
}
