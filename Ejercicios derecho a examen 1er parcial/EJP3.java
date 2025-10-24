import java.util.Scanner;
public class EJP3{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Escriba su edad: ");
	int edad=sc.nextInt();
	double pul=(220-edad)/10;
	System.out.println("Sus pulsaciones por 10 segundos deben ser: " + pul);
	sc.close();
	}
}  