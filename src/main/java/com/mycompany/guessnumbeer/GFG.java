/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessnumbeer;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class GFG {
    
    public static void guessingNumberGame() {
        Scanner scanner = new Scanner(System.in);
        
        int number = 1 + (int)(100 * Math.random());
        
        int K = 5;
        int i, guess;
        
        System.out.println(
        "Escolha um número "
        + "entre 1 a 100. "
        + "Adivinhe o número "
        + "dentro de 5 tentativas.");
        
        //Iterar sobre K
        
      for (i = 0; i < K; i++) {
          System.out.println("Adivinhe o número: ");
          guess = scanner.nextInt();
          
       if (number == guess) {
           System.out.println("Parabéns!" + "Você adivinhou o número");
           break;
           
     } else if (number > guess && i != K -1) {
         System.out.println("O número é " + "maior que " + guess);
         
     } else if (number < guess && i != K - 1) {
         System.out.println("O número é " + "menos que " + guess);
      }
          
    }
      
      if (i == K) {
          System.out.println("Vôce perdeu" + "tente novamente");
          
          System.out.println("O numero era: " + number);
      }
      
    }
    
}
//Gerando número aleatório no java usando o método Math.random().
//Usando o loop. Com a entrada K, imprimir se o número é menor ou maior que o número real.
//
