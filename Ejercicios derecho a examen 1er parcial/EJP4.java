import java.util.Scanner;
class EJP4{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int edad, act, nac;
	System.out.println("Escriba el año actual: ");
	act=sc.nextInt();
	System.out.println("Escriba su año de nacimiento: ");
	nac=sc.nextInt();
	edad=act-nac;
	System.out.println("Usted tiene: " + edad + " años.");
	sc.close();
	}
}