import java.util.Scanner;
class E17{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String[][] atletas=new String[5][4];
	System.out.println("=== REGISTRO DE ATLETAS ===");
		for (int i=0; i<5; i++){
			System.out.println("\nAtleta " + (i+1) + ": ");
			System.out.print("Nombre: ");
			atletas[i][0]=sc.next();
			System.out.print("Apellido: ");
			atletas[i][1]=sc.next();
			System.out.print("Especialidad (100 m, 200m, etc.): ");
			atletas[i][2]=sc.next();
			System.out.print("Tiempo registrado (seg): ");
			atletas[i][3]=sc.next();
		}

	int imejor=0;
		for (int i=1; i<5; i++){
			double tiempoActual=Double.parseDouble(atletas[i][3]); //para convertir el String a decimal, ayuda en internet
			double mejorTiempo=Double.parseDouble(atletas[imejor][3]);
				if (tiempoActual<mejorTiempo)
					imejor=i;
		}
	System.out.println("\n=== RESULTADOS ===");
	System.out.println("---------------------------------------------");
	System.out.println("Nombre   Apellido   Especialidad   Tiempo(s)");
	System.out.println("---------------------------------------------");
		for (int i=0; i<5; i++){
			System.out.printf("%-8s %-10s %-13s %-10s", atletas[i][0], atletas[i][1], atletas[i][2], atletas[i][3]); //medio para darle formato de salida a la matriz buscado en línea
				if (i==imejor)
					System.out.print("  <-- MEJOR TIEMPO");
			System.out.println();
		}
	System.out.println("----------------------------------------------");
	System.out.println("\nMejor tiempo: " + atletas[imejor][0] + " " + atletas[imejor][1] + " - " + atletas[imejor][3] + " segundos");
	sc.close();
	}
}

