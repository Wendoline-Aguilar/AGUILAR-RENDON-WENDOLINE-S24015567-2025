import java.util.Scanner;
class E4{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int opc;
	float saldo=5000, mr;
		System.out.println("-- BIENVENIDO AL CAJERO --");
		do{	
			System.out.println("Saldo disponible: $" + saldo);
			System.out.println("Ingrese el monto a retirar: ");
			mr=sc.nextFloat();
				if (mr>saldo)
					System.out.print("Saldo insuficiente.");
				else{
					saldo=saldo-mr;
					System.out.println("Operación realizada. \nSaldo disponible: " + saldo);
				}
			System.out.println("¿Desea continuar? 1. Sí / 2. No");
			opc=sc.nextInt();
		} while(opc==1);
			System.out.println("Cerrando sesión...");
	}
}