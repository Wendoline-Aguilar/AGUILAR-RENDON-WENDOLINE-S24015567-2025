import java.util.Scanner;
class piramide{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int i, j, k, n;
	System.out.println("Escriba el número: ");
	n=sc.nextInt();
	for (i=1; i<=n; i++){
		for (j=1; j<=(n-i); j++){
		System.out.print(" ");
		}
			for (k=1; k<=(2*i-1); k++){ //busqué en internet cómo lograr que salieran centrados
			System.out.print("*");
			}
	System.out.println();
	}
	sc.close();
	}
}
		