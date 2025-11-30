import java.util.Scanner;
class E1{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String[] nombre= new String [10];
	int i=0;
		while (i<10){
			System.out.println("Escriba el nombre: ");
			nombre[i]=sc.nextLine();
			i++;
		}
	System.out.println("========== LISTA DE NOMBRES ==========");
	i=0;
		while (i<10){
			System.out.println((i+1) + ". " + nombre[i]);
			i++;
		}
	sc.close();
	}
}