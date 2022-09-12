package ListaDeExercício;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, ft=1;

        System.out.print("Digite um Número: ");
        num = entrada.nextInt();

        while (num> 0) {
            System.out.print(num);
             if(num >1 ){
                System.out.print(" X ");
             }else{
                System.out.print(" = ");
             }
             ft = ft * num;
             num-=1;
            }
            System.out.print(ft);
    }
}

    
    //Escreva um algoritmo que leia um valor inicial A e imprima a seqüência de valores do cálculo de
    //A! e o seu resultado. Ex: 5! = 5 X 4 X 3 X 2 X 1 = 120