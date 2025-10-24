import java.util.Scanner;
class EJP8{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double C, TI=0.02, IG, ME;
	System.out.println("Ingrese el capital que desea invertir: ");
	C=sc.nextDouble();
	IG=C*TI;
	System.out.println("El interés generado del mes sería: " + IG);
	ME=C+IG;
	System.out.println("El monto esperado es de: " + ME);
	sc.close();
	}
}