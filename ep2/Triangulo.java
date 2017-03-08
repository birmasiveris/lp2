class Triangulo extends FiguraGeometrica{
	private double l1,l2,base,h;
	public void setLs(double l1, double l2){
		this.l1 = l1;
		this.l2 = l2;
	}
	public void setBase(double base){
		this.base = base;
	}
	public void setH(double h){
		this.h = h;
	}
	public double getL1(){
		return this.l1;
	}
	public double getL2(){
		return this.l2;
	}
	public double getBase(){
		return this.base;
	}
	public double getH(){
		return this.h;
	}
	public double perimetro(){
		return getL1() + getL2() + getBase(); 
	}
	public double area(){
		return (getBase()*getH())/2;
	}
}
