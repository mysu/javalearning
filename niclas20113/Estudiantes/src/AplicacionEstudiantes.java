
import java.util.Scanner;

class AplicacionEstudiantes {
    public static void main (String[] arguments){
        Notaestudiantes alumno =new Notaestudiantes () ;
        Scanner digite = new Scanner(System.in);
        float alumnos [] []= new float [2][5];
        for (int c=0;c<2;c++){
            System.out.println("Digite las notas del alumno "+(c+1));
            for(int n=0;n<5;n++){
                alumnos[c][n]=digite.nextFloat();
                alumno.nota[c]=alumnos[c][n]+alumno.nota[c];
            }
        }
        for(int c=0;c<2;c++){
            alumno.nota[c]=alumno.nota[c]/5;
        }
        alumno.comprobarnotas();
       alumno.mostraratributos();
    }
}