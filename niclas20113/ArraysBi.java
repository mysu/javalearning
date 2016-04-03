
package arraysbi;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysBi {

    public static void main(String[] args) {
        Scanner digite =new Scanner (System.in); 
        int numeros [][] = new int [5][5];
        System.out.println("Digite los números ");
        for (int n=0;n<5;n++){
            for (int c=0;c<5;c++){
               numeros[n][c] = digite.nextInt();
            }
        }
        System.out.println("La salida de los números es : ");
      for (int n=0;n<5;n++){
          for (int c=0;c<5;c++){
              System.out.println(" "+numeros[n][c]);
          }
      }      
    }
    
}
