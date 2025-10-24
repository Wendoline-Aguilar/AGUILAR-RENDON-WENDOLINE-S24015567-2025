import java.util.Scanner;
class EJP11{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int a, b, c;
	double prom;
	System.out.println("Escribe el primer valor: ");
	a=sc.nextInt();
	System.out.println("Escribe el segundo valor: ");
	b=sc.nextInt();
	System.out.println("Escribe el tercer valor: ");
	c=sc.nextInt();
		if ((a==b) && (b==c) && (a==c))
			System.out.println("Los valores son iguales.");
		else{
			if ((a>b) && (a>c)){
				prom=(a+b+c)/3;
					if ((b<a) && (b>c))
						System.out.println(a + " es mayor. " + b + " es menor." + "\nEl promedio es: " + prom);
					else
						System.out.println(a + " es mayor. " + c + " es menor." + "\nEl promedio es: " + prom);
			}
			else 
				if ((b>a) && (b>c)){
					prom=(a+b+c)/3;
						if ((a<b) && (a<c))
							System.out.println(b + " es mayor. " + a + " es menor." + "\nEl promedio es: " + prom);
						else
							System.out.println(b + " es mayor." + c + " es menor." + "\nEl promedio es: " + prom);
				}
				else{
					prom=(a+b+c)/3;
						if ((a<c) && (a<b))
							System.out.println(c + " es mayor. " + a + " es menor." + "\nEl promedio es: " + prom);
						else
							System.out.println(c + " es mayor. " + b + " es menor." + "\nEl promedio es: " + prom);
			}
		}
	sc.close();
	}
}
