package ListaDeExercício;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n=0;

        do{
            System.out.print("Digite Um Valor entre 0 é 10, para Começar a Tabuada: ");
            n= entrada.nextInt();
            
            for (int i = 0; i < 11; i++) {
                System.out.println(n + "X" + i + "=" + i * n + ";");
            }

        }while(n<=10);
    }
}


    //Escrever um algoritmo que leia um valor para uma variável N de 1 a 10 e calcule a tabuada de
    //N. Mostre a tabuada na forma: 0 x N = 0, 1 x N = 1N, 2 x N = 2N, ..., 10 x N = 10N.