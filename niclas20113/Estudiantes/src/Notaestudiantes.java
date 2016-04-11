class Notaestudiantes {
    String status ;
    float alumnos[][]=new float [5][5] ;
     float notas []= new float [5];
     
     void comprobarnotas() {
         for(int a=0 ; a<2 ; a++){
             System.out.println("Las notas del alumno "+(a+1));
             for(int n=0;n<3;n++){
                 System.out.printf(alumnos[a] [n]+ " \t ");
             }
             System.out.println( );
         }
}
      void suma (){
         for (int a=0;a<2;a++){
             System.out.println("la suma de notas del alumno "+(a+1));
             System.out.println(notas[a]);
         }
     }
      void comprobarnotas2(){
          for (int a =0;a<2;a++){
              if (notas[a]>=3.5){
                  System.out.println("El alumno "+(a+1)+" paso");
              }else{
                  System.out.println("El alumno "+(a+1)+" reprobo");
              }
          }
      }
}