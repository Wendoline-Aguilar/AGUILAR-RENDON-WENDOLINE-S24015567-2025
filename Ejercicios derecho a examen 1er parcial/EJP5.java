import java.util.Scanner;
class EJP5{
	public static void main(String args[]){
	Scanner=sc new Scanner(System.in);
	double C, F, TA;
	System.out.println("Escriba la temperatura en °C: ");
	C=sc.nextDouble();
	F=((C*(9.0/5.0))+32);
	TA=C+273.15;
	System.out.println("La temperatura en °F es: " + F);
	System.out.println("La temperatura absoluta es: " + TA);
	sc.close();
	}
}