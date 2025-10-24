import java.util.Scanner;
class EJP1{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	double met, ft, in;
	System.out.print("Ingrese los metros: ");
	met=sc.nextDouble();
	ft=met*3.2808;
	in=ft*12;
	System.out.println(met + " metros son: " + ft + " pies");
	System.out.println(met + " metros son: " + in + " pulgadas");
	sc.close();
    }
}
