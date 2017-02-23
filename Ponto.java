public class Ponto{
	private double x, y;

	public Ponto(){
                System.out.println("\nConstrutor: " +this);
        }

	public Ponto(double x, double y){
		System.out.println("\nConstrutor: 2");
		this.x = x;
		this.y = y;
	}

	public void setX(double x){
		this.x = x;
	}

	public double getX(){
		return x;
	}

	public void setY(double y){
		this.y = y;
	}

	public double getY(){
		return y;
	}

	public static void main (String [] args){
		Ponto p1 = new Ponto();
		p1.setX(5);
		p1.setY(5);
		System.out.println("\nP1 x: " + p1.getX());
		System.out.println("\nP1 y: " + p1.getY());
		Ponto p2 = new Ponto();
		p2.setX(10);
		p2.setY(10);
		System.out.println("\nP2 x: " + p2.getX());
		System.out.println("\nP2 y: " + p2.getY());
		double ca, co, h;
		co = p2.getX() - p1.getX();
		ca = p2.getY() - p1.getY();
		co = co * co;
		ca = ca * ca;
		h = Math.sqrt(ca + co);
		System.out.println("\nHipotenusa: " + h);
		Reta r1 = new Reta();
		r1.setP1(p1);
		r1.setP2(p2);
		r1.getP1().getX();
		r1.getP2().getY();
		p1.setX(30);
		System.out.println("\nR1 P1 x:: " + r1.getP1().getX() + " R1 P1 y: " + r1.getP1().getY());
		r1.getP2().setY(40);
		System.out.println("\nR1 P2 x: " + r1.getP2().getX() + " R1 P2 y: " + r1.getP2().getY());

	}
}


