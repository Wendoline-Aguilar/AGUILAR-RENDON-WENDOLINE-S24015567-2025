import java.util.Scanner;
class E13{
	public static void main(String args[]){
	int [][] alumnos= new int[3][4];
	String[] niveles={"Básico", "Medio", "Perfeccionamiento"};
	String[] idiomas={"Inglés", "Francés", "Alemán", "Ruso"};
	Scanner sc=new Scanner(System.in);
	System.out.println("====== REGISTRO POR NIVEL E IDIOMA ======");
	System.out.println("Niveles:\nBásico=0\nMedio=1\nPerfeccionamiento=2\n--------------------");
	System.out.println("Idiomas:\nInglés=0\nFrancés=1\nAlemán=2\nRuso=3\n--------------------");
		for (int i=0;  i<12; i++){
			System.out.println("Ingrese el nivel del estudiante " + (i+1) + ": ");
			int niv=sc.nextInt();
				while(niv<0 || niv>2){
					System.out.println("No válido. Ingrese nuevamente (0-2).");
					niv=sc.nextInt();
				}
			System.out.println("Ingrese el idioma del estudiante " + (i+1) + ": ");
			int id=sc.nextInt();
				while(id<0 || id>3){
					System.out.println("No válido. Ingrese nuevamente (0-3).");
					id=sc.nextInt();
				}
			alumnos[niv][id]++;
			System.out.println("================================================");
		}
	System.out.println();
	System.out.print("Nivel | Idioma\t");
		for(int i=0; i<idiomas.length; i++){
			System.out.print(idiomas[i] + "\t");
		}
	System.out.println();
	System.out.println("--------------------------------------");
		for(int i=0; i<alumnos.length; i++){
			System.out.print(niveles[i] + "\t\t");
			for(int j=0; j<alumnos[i].length; j++){
				System.out.print(alumnos[i][j] + "\t");
			}
			System.out.println();
		}
	sc.close();
	}
}

	