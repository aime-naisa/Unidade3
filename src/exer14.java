import java.util.Scanner;

public class exer14 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Distância: ");
        double distancia = sc.nextDouble();

        System.out.print("Tempo: ");
        double tempo = sc.nextDouble();

        double velocidadeMedia = distancia / tempo;
        double combustivelGasto = distancia / 12.0;

        System.out.printf("A velocidade média foi de %.2f km/h e a quantidade de combustível usado foi %.2f litros.\n",
                velocidadeMedia, combustivelGasto);

        sc.close();
    }
}
