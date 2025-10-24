import java.util.Scanner;
class EJP19{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double G=0.40, T=0.30, P=0.30, PA;
	System.out.println("Ingrese el presupuesto anual:");
	PA=sc.nextDouble();
	G=PA*G;
	System.out.println("El presupuesto destinado a ginecología es: " + G);
	T=PA*T;
	System.out.println("El presupuesto destinado a traumatología es: " + T);
	P=PA*P;
	System.out.println("El presupuesto destinado a pediatría es: " + P);
	sc.close();
	}
}