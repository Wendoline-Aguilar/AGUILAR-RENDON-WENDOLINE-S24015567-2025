import java.util.Scanner;
class EJP7{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double desc=0.15, PC, PF, PD;
	System.out.println("Escriba el precio de su compra: ");
	PC=sc.nextDouble();
	PD=(desc*PC);
	PF=PC-PD;
	System.out.println("El descuento generado a su compra es de: " + PD);
	System.out.println("El precio final de su compra es de: " + PF);
	sc.close();
	}
}