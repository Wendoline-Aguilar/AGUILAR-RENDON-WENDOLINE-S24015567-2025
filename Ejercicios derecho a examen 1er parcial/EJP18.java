import java.util.Scanner;
public class EJP18{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int t, precio=10;
	System.out.println("ingrese los minutos de duración de su llamada:");
	t=sc.nextInt();
		if (t<=3)
			System.out.println("Su llamada cuesta: " + precio);
		else
			if (t>3){
				precio=precio+(t-3);
				System.out.println("Su llamada con recargo tendrá un costo de: " + precio);
			}
	}
}