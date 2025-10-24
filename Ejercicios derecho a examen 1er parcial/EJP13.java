import java.util.Scanner;
class EJP13{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Ingrese e valor de A: ");
	double A=sc.nextDouble();
	System.out.println("Ingrese el valor de B: ");
	double B=sc.nextDouble();
	System.out.println("Ingrese el valor de C: ");
	double C=sc.nextDouble();
		if (A==0)
			System.out.println("A=0 no es una ecuación cuadrática.");
		else{
		double d=B*B-4*A*C;
		if(d<0){
			double real=-B/(2*A);
			double imag=Math.sqrt(-d)/(2*A); //Nota: se hace uso de otro método a partir de consulta de otras fuentes.
			System.out.println(" -- Raíces complejas -- ");
			System.out.println("x1= " + real + " | " + imag + "i");
			System.out.println("x2= " + real + "| " + imag + "i");
		} else
			if (d==0){
				double x=-B/(2*A);
				System.out.println("Una raíz doble: x= " + x);
			} else {
				double x1=(-B+Math.sqrt(d))/(2*A);
				double x2=(-B-Math.sqrt(d))/(2*A);
				System.out.println("Raíz 1: " + x1 + "\nRaíz 2: " + x2);
			}
		}
		sc.close();
	}
}