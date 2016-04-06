
package arraysbi;

import java.util.Scanner;

public class ArraysBi {

    public static void main(String[] args) {
        Scanner digite =new Scanner (System.in); 
        int numeros [][] = new int [5][5];
        for (int n=0;n<5;n++){
            for (int c=0;c<5;c++){
               numeros[n][c] = (int)(Math.random()*10+1);
            }
        }
        System.out.println("\nLa salida de los números es : ");
        System.out.println("\n");
      for (int n=0;n<5;n++){
          for (int c=0;c<5;c++){
              
              System.out.printf(numeros[n][c]+ "\t");
              
          }
          System.out.println("\n");
      }      
    }
    
}
