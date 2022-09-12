package ListaDeExercício;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double maior = 0;
        double menor = 0;
        Integer quantidade = 4;
        Double[] alturas = new Double[quantidade];

        for (int i = 0; i < quantidade ; i++) {
            System.out.print("Digite O " + (i + 1) + "º Altura é Aperte enter: ");
            alturas[i] = entrada.nextDouble();
            maior = alturas[i];
            menor = alturas[i];
        }
        for (int i = 0; i <quantidade ; i++) {

            if (alturas[i] > maior){
                maior = alturas[i];
            }else if(alturas[i]< menor){
                menor = alturas[i];
            }
        }

        System.out.println("A maior Altura digitado é: " + maior);
        System.out.println("A Menor Alutra digitado é: " + menor);
    }
}

    

    //Desenvolver um algoritmo que leia a altura de 15 pessoas. Este programa deverá calcular e
    //mostrar :
    //a. A menor altura do grupo;
    //b. A maior altura do grupo;