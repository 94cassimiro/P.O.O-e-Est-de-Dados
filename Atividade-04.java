package ListaDeExercício;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = 1;
        int qt1=0, qt2=0 , qt3 = 0 , qt4 = 0, intervalo = 0;

        while (number>= 0) {

            System.out.print("Digite Um Número: ");
            number = sc.nextInt();

            if((number <= 0) || (number>100)){
                intervalo +=1;
            }else if((number >=0) && (number<=25)){
                qt1+=1;
            }else if((number>=26) && (number<=50)){
                qt2+=1;
            }else if((number>=51) && (number<=75)){
                qt3+=1;
            }else if((number>=76) && (number<=100)){
                qt4+=1;
            }

        }
        System.out.println(" Os números no intervalo de 0 a 25 e : " + qt1);
        System.out.println("Os números no intervalo de 25 a 50 e : " + qt2);
        System.out.println("Os números no intervalo de 50 a 75 e : " + qt3);
        System.out.println("Os números no intervalo de 75 a 100 e : " + qt4);
        System.out.print("Os números fora do intervalo e: " + intervalo);
 
    }
 
}



    //Escrever um algoritmo que leia uma quantidade desconhecida de números e conte quantos deles
    //estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve
    //terminar quando for lido um número negativo.