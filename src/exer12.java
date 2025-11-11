import java.util.Scanner;

public class exer12 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Quantidade de horas trabalhadas no mês: ");
        int horas = sc.nextInt();

        System.out.print("Número de dependentes: ");
        int dependentes = sc.nextInt();

        double salarioTrabalho = horas * 10.0;
        double salarioFamilia = dependentes * 60.0;
        double salarioBruto = salarioTrabalho + salarioFamilia;
        double descontoINSS = salarioTrabalho * 0.085;
        double descontoIR = salarioTrabalho * 0.05;
        double salarioLiquido = salarioBruto - descontoINSS - descontoIR;

        System.out.printf("O funcionário %s possui um salário bruto de R$ %.2f e um salário líquido de R$ %.2f\n",
                nome, salarioBruto, salarioLiquido);

        sc.close();
    }
}
