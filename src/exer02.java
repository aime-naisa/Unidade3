import java.util.Scanner;

public class exer02 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o preço do par de sapatos:");
        double preco = sc.nextDouble();
        
        double desconto = preco * 0.12;
        double precoFinal = preco - desconto;
       
        System.out.printf("O valor do desconto é de R$ %.2f\n", desconto);
        System.out.printf("O preço do par de sapatos com desconto é R$ %.2f\n", precoFinal);
        
        sc.close();
    }
}
