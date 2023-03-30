/*Escreva um programa que inverta os caracteres de um string. */

import java.util.Scanner;

public class QuestaoCinco {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva uma palavra para ser invertida ");
        String user = sc.next();
        String out = " ";

        for( int i = user.length() - 1; i >= 0; i -- ) { //vai rodar o loop p ordenar as palar invertidas

            out = out + user.charAt(i);

        }

        System.out.println("Os caracteres da String invertida são: " + "\n" + out );

    } 
}


