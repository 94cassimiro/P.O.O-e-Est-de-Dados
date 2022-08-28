import java.util.Locale;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int distanciaPercorrida = input.nextInt();
        double qtdCombustivel = input.nextDouble();

        double mediaCombustivelGasto = distanciaPercorrida / qtdCombustivel;

        System.out.printf("%.3f km/1%n", mediaCombustivelGasto);

        input.close();


    }


}