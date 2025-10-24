import java.util.Scanner;
public class EP2{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double r, C, A, pi=3.14;
	System.out.println("Escriba el valor del radio: ");
	r=sc.nextDouble();
	C=(2*pi)*r;
	A=pi*(r*r);
	System.out.println("La circunferencia es: " +  C);
	System.out.println("El área es: " + A);
	sc.close();
	}
}