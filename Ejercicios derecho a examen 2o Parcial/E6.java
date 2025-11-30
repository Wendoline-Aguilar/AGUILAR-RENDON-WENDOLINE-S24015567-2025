import java.util.Scanner;
class E6{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double calif, a=0, aap=0, ar=0;
		for (int i=0; i<5; i++){
			System.out.println("Escriba la calificación del alumno " + (i+1) + ": ");
			calif=sc.nextDouble();
			a=a+calif;
				if (calif>=6)
					aap++;
				else
					ar++;
		}
	System.out.println("El promedio del grupo es: " + a/5);
	System.out.println("Los alumnos aprobados son: " + aap);
	System.out.println("Los alumnos reprobados son: " + ar);
	sc.close();
	}
}
