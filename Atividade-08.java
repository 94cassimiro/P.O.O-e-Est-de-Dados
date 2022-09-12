package ListaDeExercício;
import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in); 
        int inicialA=0 , razao =0, n= 0;

        System.out.print("Digite a Inicial A:");
        inicialA = ent.nextInt();

        System.out.print("Digite a Razão:");
        razao = ent.nextInt();

        do{
            System.out.print(inicialA + " ");
            inicialA+= razao;
            n++;

        }while(n < 10 );
    }
}


    //Escreva um algoritmo que leia um valor inicial A e uma razão R e imprima uma seqüência em
    //P.A. contendo 10 valores.