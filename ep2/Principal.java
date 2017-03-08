class Main{
	public static void main (String[] args){

		System.out.println("\nCircuferencia: ");
		Circuferencia A = new Circuferencia();
		A.setRaio(2);
		System.out.println("Area = " + A.area() + "\nPerimetro = " + A.perimetro());

		System.out.println("\nRetangulo: ");
		Retangulo B = new Retangulo();
		B.setLs(2, 4);
		System.out.println("Area = " + B.area() + "\nPerimetro = " + B.perimetro());

		System.out.println("\nTrapezio: ");
		Trapezio C = new Trapezio();
		C.setBases(2, 4);
		C.setH(2);
		C.setLs(4, 1);
		System.out.println("Area = " + C.area() + "\nPerimetro = " + C.perimetro());
		
		System.out.println("Triangulo: ");
		Triangulo D = new Triangulo();
		D.setLs(2, 2);
		D.setBase(2);
		D.setH(2);
		System.out.println("Area = " + D.area() + "\nPerimetro = " + D.perimetro());

		System.out.println("\nQuadrado:");
		Quadrado E = new Quadrado();
		E.setL(4);
		System.out.println("Area = " + E.area() + "\nPerimetro = " + E.perimetro());

		

		
	 
	}
}
