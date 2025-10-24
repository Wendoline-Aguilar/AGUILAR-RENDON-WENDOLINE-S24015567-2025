import java.util.Scanner;
class EJP12{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double sal, DS;
	System.out.println("Escriba el salario bruto del trabajador (de 1000 a 20000): ");
	sal=sc.nextDouble();
		if ((sal<=20000) && (sal>15000)){
			System.out.println(" --- TRABAJADOR CATEGORÍA 1 --- ");
			DS=(sal*0.072);
			System.out.println("El descuento por salud es: " + DS);
			sal=sal-DS;
			System.out.println("El salario final del trabajador es: " + sal);
		} else
			if ((sal<=15000) && (sal>10000)){
				System.out.println(" --- TRABAJADOR CATEGORÍA 2 --- ");
				DS=(sal*0.072);
				System.out.println("El descuento por salud es: " + DS);
				sal=sal-DS;
				System.out.println("El salario final del trabajador es: " + sal);	
			} else 
				if ((sal<=10000) && (sal>7500)){
					System.out.println(" --- TRABAJADOR CATEGORÍA 3 --- ");
					DS=(sal*0.072);
					System.out.println("El descuento por salud es: " + DS);
					sal=sal-DS;
					System.out.println("El salario final del trabajador es: " + sal);	
				} else 
					if ((sal<=7500) && (sal>1000)){
						System.out.println(" --- TRABAJADOR CATEGORÍA 4 --- ");
						DS=(sal*0.072);
						System.out.println("El descuento por salud es: " + DS);
						sal=sal-DS;
						System.out.println("El salario final del trabajador es: " + sal);	
					}
					else
						if (sal<1000){
						sal=sal+(sal*0.15);	
						System.out.println("El salario final del trabajador con subsidio es: " + sal);
					}
	sc.close();
	}
}	