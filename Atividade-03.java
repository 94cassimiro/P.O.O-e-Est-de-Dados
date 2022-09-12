package ListaDeExercício;

import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 0, qtnum = 0, soma = 0, vlPositivo = 0, vlNegativo = 0, porPar, porImpar;
        double mediaA;
        
        while (true) {
            System.out.print("Coloque os Números : ");
            num = entrada.nextInt();
            qtnum++;
            soma += num;
            mediaA = soma / num;

            if (num >= 0) {
                vlPositivo += 1;
            } else {
                vlNegativo += 1;
            }

            porPar = vlPositivo * 100 / qtnum;
            porImpar = vlNegativo * 100 / qtnum;

            System.out.println("A média Aritmética: " + mediaA);
            System.out.println("A quantidade de valores Positivos é: " + vlPositivo);
            System.out.println("A quantidade de valores Negativos é: " + vlNegativo);
            System.out.println("O percentual de valores Positivos é: " + porPar);
            System.out.println("O percentual de valores Negativos é: " + porImpar + " \n ");

        }

    }

    // Desenvolver um algoritmo que leia um número não determinado de valores e
    // calcule e escreva a
    // média aritmética dos valores lidos, a quantidade de valores positivos, a
    // quantidade de valores negativos e o percentual de valores negativos e
    // positivos.
}