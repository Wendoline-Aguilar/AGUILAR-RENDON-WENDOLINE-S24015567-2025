import java.util.Scanner;
class E3{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int opc;
	float adeudo=1000, pagom;
	do{
	System.out.println("====== CAJERO AUTOMÁTICO ======");
	System.out.println("1. Consulta. \n2. Pago del mes. \n3. Pago de adeudo. \n4. Salir.");
	System.out.println("Elija una opción: ");
	opc=sc.nextInt();
		switch (opc){
			case 1: 
				System.out.println("----- CONSULTA -----");
				System.out.println("Su adeudo es de: " + adeudo);
				break;
			case 2: 
				System.out.println("----- PAGO DEL MES -----");
				System.out.println("El adeudo del mes es de: " + adeudo);
				System.out.println("Ingrese el monto a pagar: ");
				pagom=sc.nextFloat();
				System.out.println("Pago realizado con éxito \nSu adeudo restante es de: " + (adeudo-pagom));
				break;
			case 3:
				System.out.println("----- PAGO DE ADEUDO -----");
				System.out.println("Su adeudo total es de: " + adeudo);
				System.out.println("Esperando pago... \nPago de adeudo realizado. \nAdeudo restante: " + (adeudo-adeudo));
				break;
			case 4: 
				System.out.println("Gracias por usar el sistema. \nSaliendo...");
				break;
			default: 
				System.out.print("Opción no válida. Intente de nuevo.");
		}
	} while (opc!=4);
	sc.close();
	}
}
	
