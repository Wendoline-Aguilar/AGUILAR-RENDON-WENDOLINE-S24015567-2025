import java.util.Scanner;
class E14{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	String [] nom=new String [4];
	int [][] sueldo=new int [4][3];
	int [] sumas=new int[4];
	int total=0, mayoring=0;
		for (int i=0; i<4; i++){
			System.out.println("Escriba el nombre del empleado " + (i+1) + ": ");
			nom[i]=sc.next();
			for (int j=0; j<3; j++){
				System.out.println("Sueldo del mes " + (j+1) + " de " + nom[i] + ": ");
				sueldo[i][j]=sc.nextInt();
			}
			System.out.println("-----------------------------------------------");
		}
		for (int i=0; i<4; i++){
			for (int j=0; j<3; j++){
				sumas[i]+=sueldo[i][j];
			}
		total+=sumas[i];
		}
		for (int i=1; i<4; i++){
			if (sumas[i]>sumas[mayoring])
			mayoring=i;
		}
	System.out.println("-------------------------------------------------");
	System.out.println("Empleado\tMes 1\tMes 2\tMes 3\tTotal ");
	System.out.println("-------------------------------------------------");
		for (int i=0; i<4; i++){
			System.out.print(nom[i] + "\t\t");
			for (int j=0; j<3; j++){
				System.out.print(sueldo[i][j] + "\t");
			}
		System.out.println(sumas[i]);
		}
	System.out.println();
	System.out.println("Total pagado a los empleados: " + total);
	System.out.println("Empleado con mayor ingreso: " + nom[mayoring] + " (" + sumas[mayoring] + ")"); 
	sc.close();
	}
}