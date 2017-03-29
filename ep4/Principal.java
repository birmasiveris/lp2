public class Principal{
	public static void main(String[] args){
		Exemplo e1 = new Exemplo();
		e1.Incrementar();
		Exemplo e2 = new Exemplo();
		System.out.println(Exemplo.x);
		Exemplo e3 = new Exemplo();
		e3.Incrementar();
		System.out.println(Exemplo.x);
		Exemplo.Decrementar();
		System.out.println(Exemplo.x);
	}
}
