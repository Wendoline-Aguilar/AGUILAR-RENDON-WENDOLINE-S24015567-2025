import java.util.Scanner;
class E12{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int venta[]=new int[7];
	int a=0, b=0;
		for(int i=0; i<venta.length; i++){
			System.out.println("Ingrese la venta del día " +(i+1)+": ");
			venta[i]=sc.nextInt();
			a+=venta[i];
				if (b<venta[i])
					b=venta[i];
		}
	System.out.println("La venta total de la semana es: $" + a);
	System.out. println("La venta mayor del día fue de: $" + b);
	sc.close();
	}
}
			