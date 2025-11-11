import java.util.Scanner;

public class exer15 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro (até 3 dígitos): ");
        int numero = sc.nextInt();

        int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = numero % 10;

        System.out.printf("%d centena(s) %d dezena(s) %d unidade(s)\n", centenas, dezenas, unidades);

        sc.close();
    }
}
