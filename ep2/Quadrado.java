class Quadrado extends FiguraGeometrica{
	private double l;
	public void setL(double l){
		this.l = l;
	}
	public double getL(){
		return this.l;
	}
	public double  perimetro(){
		return getL()*4;
	}
	public double area(){
		return Math.pow(getL(),2);
	}
}
