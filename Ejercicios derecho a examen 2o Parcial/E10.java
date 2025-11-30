import java.util.Scanner;
class E10{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int num []=new int[10];
		for (int i=0;i<num.length;i++){
			System.out.println("Ingresa el número " + (i+1) + ": ");
			num[i]=sc.nextInt();
		}
		System.out.println("Lista de números: ");
		for(int i=num.length-1;i>=0;i--){
			System.out.print(num[i] + " ");
		}
	}
}