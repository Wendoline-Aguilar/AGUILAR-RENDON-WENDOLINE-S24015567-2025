import java.util.Scanner;
class EJP6{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Ingrese la cantidad de alumnas: ");
	int M=sc.nextInt();
	System.out.println("Ingrese la cantidad de alumnos: ");
	int H=sc.nextInt();
	double PM=(M*100)/(H+M);
	double PH=(H*100)/(H+M);
	System.out.println("El porcentaje de mujeres es de: " + PM);
	System.out.println("El porcentaje de hombres es de: " + PH);
	sc.close();
	}
}