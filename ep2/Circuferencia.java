class Circuferencia extends FiguraGeometrica{
	private double raio;
	private double pi = 3.14;
	public void setRaio(double raio){
		this.raio = raio;
	}
	public double getRaio(){
		return raio;
	}
	public double perimetro(){
		return pi*getRaio()*2;
	}
	public double area(){
		return pi*Math.pow(raio,2);
	}
}
