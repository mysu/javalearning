
package arrays;


public class Arrays {

    
    public static void main(String[] args) {
      String frase[] = {
      "La casa de al lado",
      "un parlante lg bluetooth",
      "colocar las comillar pegadas",
      "exactamente igual que los demas"
    };
    int[] contadorVocales = new int [100] ;
    for (int contador = 0 ; contador < frase.length ; contador++){
        String current = frase[contador];
        char[] vocales = current.toCharArray();
        for(int contador2 = 0 ;contador2  < vocales .length; contador2++){
            char voc = vocales[contador2];
            if ( (voc >= 'a') & (voc <= 'o') ) {
                contadorVocales[voc - 'a' ]++;
               
            }
        }
    }
    for( char contador = 'a' ;contador <= 'o';contador++ ){
       System.out.print(contador+":" + contadorVocales[contador - 'a' ] +
               " ") ;
    } 
        System.out.println();
    }
    
}
