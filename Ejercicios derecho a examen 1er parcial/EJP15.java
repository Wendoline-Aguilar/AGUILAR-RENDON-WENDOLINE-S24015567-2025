import java.util.Scanner;
class EJP15{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double calif;
	System.out.println("Ingrese la calificación:");
	calif=sc.nextDouble();
		if ((calif==0.0)  || (calif<=1.0))
			System.out.println("La calificación es P (pésimo).");
		else
			if ((calif==1.1) || (calif<=2.0))
				System.out.println("La calificación es M (mala).");
			else 
				if ((calif==3.0) || (calif<=4.0))
					System.out.println("La calificación es B (buena).");
				else
					if ((calif==4.1) || (calif<=5.0))
						System.out.println("La calificación es E (excelente).");
					else
						if ((calif>=5.1))
						System.out.println("No existe esa calificación. Intente de nuevo.");
	sc.close();
	}
}