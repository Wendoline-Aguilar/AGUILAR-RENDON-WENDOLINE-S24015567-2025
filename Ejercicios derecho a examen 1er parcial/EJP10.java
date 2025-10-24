import java.util.Scanner;
class EJP10{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double M1, M2, M3, prom, prom2=10;
	System.out.println("Ingrese la calificación de la 1er materia: ");
	M1=sc.nextDouble();
	System.out.println("Ingrese la calificación de la 2da materia: ");
	M2=sc.nextDouble();
	System.out.println("Ingrese la calificación de la 3er materia: ");
	M3=sc.nextDouble();
	prom=(M1+M2+M3)/3;
	System.out.println("El promedio general es de: " + prom2);
	System.out.println("Su promedio obtenido es de: " + prom);
	sc.close();
	}
}
	