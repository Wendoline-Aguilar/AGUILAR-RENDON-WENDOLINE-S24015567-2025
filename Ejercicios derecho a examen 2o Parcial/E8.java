class E8{
	public static void main(String args[]){
	double in=0.09, a=0, am=500;
		for (int i=0; i<12; i++){
			System.out.println("El ahorro del mes " + (i+1) + " es: " + am);
			am=(am*in)+am;
			a=a+am;
		}
	System.out.println("El ahorro de un año es de: " + a);
	}
}