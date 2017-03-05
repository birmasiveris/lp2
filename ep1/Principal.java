public class Principal{
	public static void  main(String args[]){
		Lista A = new Lista();
		
		A.inserir(1);
		A.inserir(2);
		A.inserir(3);
		System.out.println("Lista:");
		A.listar();
		System.out.println("\nPesquisa o número 2:");
		A.pesquisar(2);
		System.out.println("\nPesquisa o número 4:");
		A.pesquisar(4);
		System.out.println("\nRemove o elemento 2:");
		A.remover(2);
		A.listar();
		System.out.println("\nInsere o número 4:");
		A.inserir(4);
		A.listar();
	}
}
