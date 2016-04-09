class Notaestudiantes {
    String status ;
    float nota[]=new float [5] ;
     
    void comprobarnotas (){
        for (int c=0;c<2;c++){
        if (nota[c] >=3.5){
            status = "El alumno "+(c+1)+" paso la materia con "+nota[c] ;
        }else{
            status="El alumno "+(c+1)+" reprobo la materia con "+nota[c];
        }
    } 
    }
    void mostraratributos(){
        for(int c=0;c<2; c++){
        System.out.println("\n---------------\n");
        System.out.println( status);
        }
   }
}