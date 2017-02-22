public class Ponto{
	private double x, y;
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
		System.out.println("Birmaaaaaa");
		Ponto p1 = new Ponto();
		p1.setX(5);
		p1.setY(5);
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		Ponto p2 = new Ponto();
		p2.setX(10);
		p2.setY(10);
		System.out.println(p2.getX());
		System.out.println(p2.getY());
		double ca, co, h;
		co = p2.getX() - p1.getX();
		ca = p2.getY() - p1.getY();
		co = co * co;
		ca = ca * ca;
		h = Math.sqrt(ca + co);
		System.out.println(h);

	}
}


