class Retangulo extends FiguraGeometrica{
	private double l1,l2;
	public void setLs(double l1, double l2){
		this.l1 = l1;
		this.l2 = l2;
	}
	public double getL1(){
		return this.l1;
	}
	public double getL2(){
		return this.l2;
	}
	public double perimetro(){
		return  2*getL1() + 2*getL2();
	}
	public double area(){
		return getL1()*getL2();
	}
}