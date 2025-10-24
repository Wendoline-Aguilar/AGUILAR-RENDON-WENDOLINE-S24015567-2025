import java.util.Scanner;
class EJP20{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double d, n, TC;
	System.out.println("Ingrese el total de su compra: ");
	TC=sc.nextDouble();
	System.out.println("Escriba un número al azar: ");
	n=sc.nextDouble();
		if (n<74){
			d=TC*0.15;
			System.out.println("El descuento obtenido es de: " + d);
			TC=TC-d;
			System.out.println("El total de su compra con descuento es: " + TC);
		}
		else {
			d=TC*0.20;
			System.out.println("El descuento obtenido es de: " + d);
			TC=TC-d;
			System.out.println("El total de su compra con descuento es: " + TC);
		}
		sc.close();
	}
}