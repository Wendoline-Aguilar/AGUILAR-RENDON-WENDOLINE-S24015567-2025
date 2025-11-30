import java.util.Scanner;
class E16{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String[][] articulos=new String[3][3];
	System.out.println("=== REGISTRO DE ARTÍCULOS ==="); 
		for (int i=0; i<3; i++){
			System.out.println("\nartículo " + (i+1) + ": ");
			System.out.print("Nombre del artículo (camisa, zapato, pantalón): ");
			articulos[i][0]=sc.next();
			System.out.print("Talla: ");
			articulos[i][1]=sc.next();
			System.out.print("Color: ");
			articulos[i][2]=sc.next();
		}
	System.out.println("\n=== INVENTARIO DE ARTÍCULOS ===");
	System.out.println("-----------------------------------");
	System.out.println("Artículo   Talla   Color");
	System.out.println("-----------------------------------");
		for(int i=0; i<3; i++){
			System.out.printf("%-10s %-7s %-10s%n", articulos[i][0], articulos[i][1], articulos[i][2]);
		}
	System.out.println("-----------------------------------");
	sc.close();
	}
}