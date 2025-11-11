import java.util.Scanner;

public class exer03 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Preço do litro de gasolina: ");
        double precoLitro = sc.nextDouble();
        
        System.out.print("Valor do pagamento: ");
        double valorPagamento = sc.nextDouble();
        
        double litros = valorPagamento / precoLitro;
        
        System.out.printf("O motorista conseguiu colocar: %.2f litros.\n", litros);
       
        sc.close();
    }
}
