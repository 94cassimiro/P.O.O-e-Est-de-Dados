package ListaDeExercício;

import java.util.Scanner;


public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,soma =0, par = 0, impar =0;
        double somaI=0, somaP=0;
    
        do{
            System.out.print("Coloque um Número: ");
            num = sc.nextInt();

            if(num %2 == 0){
                somaP+= num;
                par++;
                
            }
            else{
                somaI+=num;
                impar++;
            }
        }while(num!=0);   
        
        
        
            System.out.println("Números Pares: " + par);
            System.out.println("Números Impares: " + impar);
            System.out.println("Média de Números Pares: "+ somaP/par);
            System.out.println("Quatidade de Pares e Impares: " + (par + impar));
            

        }
    }



    //Faça um algoritmo estruturado que leia uma quantidade não determinada de números positivos.
    //Calcule a quantidade de números pares e ímpares, a média de valores pares e a média geral dos
    //números lidos. O número que encerrará a leitura será zero.