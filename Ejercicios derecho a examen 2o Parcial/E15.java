import java.util.Scanner;
class E15{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String[] paises=new String[4];
	double[][] temperaturas=new double [4][3];
	double[] media=new double [4];
		for (int i=0; i<4; i++){
			System.out.println("Ingrese el nombre del país " + (i+1) + ": ");
			paises[i]=sc.next();
		}
	System.out.println();
		for(int i=0; i<4; i++){
			System.out.println("Temperaturas para " + paises[i] +  ": ");
			for(int j=0; j<3; j++){
				System.out.print("Temperatura del mes: " + (j+1) + ": ");
				temperaturas[i][j]=sc.nextDouble();
			}
		System.out.println();
		}
	System.out.println("=== TEMPERATUTRAS INGRESADAS ===");
	System.out.println("País\t\tMes 1\tMes 2\tMes 3");
	System.out.println("----------------------------------------");
		for(int i=0; i<4; i++){
			System.out.print(paises[i] + "\t");
			if (paises[i].length()<8) 
				System.out.print("\t");
			for(int j=0; j<3; j++){
				System.out.print(temperaturas[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int i=0; i<4; i++){
			double suma=0;
			for(int j=0; j<3; j++){
				suma+=temperaturas[i][j];
			}
			media[i]=suma/3;
		}
	System.out.println("=== TEMPERATURAS MEDIAS TRIMESTRALES ===");
		for(int i=0; i<4; i++){
			System.out.println(paises[i] + ": " + String.format("%.2f", media[i]) + "°C"); //medio para darle formato buscado en línea
		}
	int iAlta=0;
		for(int i=1; i<4; i++){
			if(media[i]>media[iAlta])
				iAlta=i;
		}
	System.out.println("País con la temperatura más alta: " + paises[iAlta]);
	System.out.println("Temperatura media: " + String.format("%.2f", media[iAlta]) + "°C");
	sc.close();
	}
}
