
import java.util.Scanner;

class AplicacionEstudiantes{

    public static void main (String[] arguments){
        Notaestudiantes alum = new Notaestudiantes() ;
        Scanner digite = new Scanner (System.in );
        
        for(int a=0;a<2;a++){
            System.out.println("Digite las notas del alumno "+(a+1));
            for(int n=0;n<3;n++){
                alum.alumnos[a][n] =digite.nextFloat();
            }
        }
        System.out.println("\n---------------\n");
        alum.comprobarnotas();
        System.out.println("\n---------------\n");
        for(int a=0;a<2;a++){
            for (int n=0;n<3;n++){
                alum.notas[a]=alum.alumnos[a][n]+alum.notas[a];
            }
            alum.notas[a]=alum.notas[a]/3;
        }
         alum.suma();
        System.out.println("\n-------------\n");
        alum.comprobarnotas2();
    }
}