import java.util.Scanner;
class EJP14{
	public static void main(String args[]){
	Scanner sc=new Scanner (System.in);
	double comision;
	System.out.println("Escriba el valor total de sus 4 ventas (a partir de 10.000.000): ");
	int venta=sc.nextInt();
		if (venta==10000000){
			comision=(venta*0.02);
			System.out.println("Tu comisión generada fue: " +  comision);
		} else
			if ((venta>10000000) && (venta<15000000)){
				comision=(venta*0.04);
				System.out.println("Tu comision generada fue: " + comision);
			} else
				if (venta>15000000){
					comision=(venta*0.10);
					System.out.println("Tu comisión generada fue: " +  comision);
				}
		sc.close();
		}
}