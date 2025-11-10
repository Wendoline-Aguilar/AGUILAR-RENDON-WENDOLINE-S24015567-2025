import java.util.Scanner;
class Potencias{
	public static void main(String args[]){
	Scanner sc=new Scanner (System.in);
	int b, p, i;
	float re=1;
	System.out.println("Escriba el número base: ");
	b=sc.nextInt();
	System.out.println("Escriba la potencia: ");
	p=sc.nextInt();
	for (i=1; i<=p; i++){
		 	re=(re*b);
	}
	System.out.println("El resultado es: " + re);
	sc.close();
	}
}