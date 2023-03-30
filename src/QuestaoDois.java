import java.util.Scanner;

public class QuestaoDois {
   
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Informe um número inteiro para verificar se pertence ou não à sequencia Fibonacci: " + "\n");
            int user = sc.nextInt(); //armazenando o que o usuário digitar como inteiro
    
            //poderia ser com vetores também
            //dando valores iniciais para começar o esquema de fibonacci, em que x armazena y e y armazena z, porém o z vai iniciar com 0;
            int x = 0; 
            int y = 1;
            int z = 0;
            boolean pertence = false;
    
            while (z <= user) {
                // enquando o z for menor ou igual a o que o usuario digitar (aqui to fazendo para fibonacci ser do input para menos) vai rodar o loop

                z = x + y;
                x = y;
                y = z;

                
                if (z == user) { //se o calculo for igual ao que foi informado (ou seja, o usuario digitou um numero que é da sequencia), o boolean que era falso vira true e sai
                    pertence = true;
                    break;
                }
                
            }
    
            if (pertence) {
                System.out.println(user + " pertence à sequência de Fibonacci");
            } else {
                System.out.println(user + " não pertence à sequência de Fibonacci");
            }
        }

}
    

