import java.util.Scanner;
class E9{
public static void main (String [] args){
	String alumnos [] =new String [6];
	double calificaciones [] = new double[6];
	Scanner sc=new Scanner(System.in);
	double a=0;
	System.out.println ("==== Alumnos y calificaciones ===");
		for(int i=0; i<alumnos.length; i++){
			System.out.println("Escribe el nombre del alumno " + (i+1) + ": ");
			alumnos[i]=sc.next();
			System.out.println("Escribe la calificación del alumno " + (i+1) + ": ");
			calificaciones[i]=sc.nextDouble();
			a+=calificaciones[i];
		}
		for (int i=0; i<alumnos.length; i++){
			System.out.println(alumnos[i] + " calificación: " + calificaciones[i]);  
		}
			System.out.println("El promedio del grupo es: " + (a/alumnos.length));
	sc.close();
	}
}