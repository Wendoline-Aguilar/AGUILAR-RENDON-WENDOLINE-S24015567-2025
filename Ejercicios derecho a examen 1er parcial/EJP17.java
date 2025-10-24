import java.util.Scanner;
public class EJP17{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("Ingrese un número entero: ");
	n=sc.nextInt();
		if (n<=1)
			System.out.println("El número no es primo.");
		else 
			if (n%2==0)
				System.out.println("El número no es primo.");
			else
				if ((n%n==0) || (n%1==0))
					System.out.println("El número es primo.");
	sc.close();
	}
}