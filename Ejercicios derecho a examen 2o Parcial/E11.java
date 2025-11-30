import java.util.Scanner;
class E11{
	public static void main(String asrgs[]){
	Scanner sc=new Scanner(System.in);
	int num[]=new int[8];
	int a, b=0;
		for (int i=0; i<8; i++){	
		System.out.print("Escriba el número " + (i+1) + ": ");
		num[i]=sc.nextInt();
		}
		System.out.println("Ingrese el número que desea buscar: ");
		a=sc.nextInt();
		for (int i=0; i<num.length; i++){
			if (num[i]==a)
				b=1;
		}
			if(b==1)
				System.out.println("El número existe.");
			else
				System.out.println("El número no existe.");
		sc.close();
	}
}