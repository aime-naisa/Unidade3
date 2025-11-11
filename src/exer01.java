import java.util.Scanner;

public class exer01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a largura e o comprimento do terreno:");
        int largura = sc.nextInt();
        
        int comprimento = sc.nextInt();
        int area = largura * comprimento;
        
        System.out.println(area);
        
        sc.close();
    }
}
