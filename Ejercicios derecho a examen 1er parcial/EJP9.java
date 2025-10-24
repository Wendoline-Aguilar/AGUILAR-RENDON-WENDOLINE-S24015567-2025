import java.util.Scanner;
class EJP9{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double inc=0.25, S, NS, AS;
	System.out.println("Escribe tu salario actual: ");
	S=sc.nextDouble();
	AS=(inc*S);
	NS=AS+S;
	System.out.println("Su nuevo salario es de: " + NS);
	sc.close();
	}
}