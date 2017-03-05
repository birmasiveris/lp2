class No{
	private int item;
	private No prox, ant;
	
	public void setItem(int item){
		this.item = item;
	}
	public int getItem(){
		return this.item;
	}
	public void setProx(No prox){
		this.prox = prox;
	}
	public No getProx(){
		return this.prox;
	}
	public void setAnt(No ant){
		this.ant = ant;
	}
	public No getAnt(){
		return this.ant;
	}
}
public class Lista{
	private No cabeca = null, aux = null;
	
	public void listar(){
		No cursor = cabeca;
		while (cursor != null){
			System.out.println(" " + cursor.getItem());
			cursor = cursor.getProx();
		}
	}
	public void inserir(int item){
		No novo = new No();
		novo.setItem(item);
		if (cabeca == null){
			cabeca = novo;
			aux = novo;
		}else{
			novo.setAnt(aux);
			aux.setProx(novo);
			aux = novo;
		}
	}
	public void remover(int item){
		No cursor = cabeca;
		No outro;
		while  (cursor != null){
			if (cursor.getItem() == item){
				outro = cursor.getAnt();
				outro.setProx(cursor.getProx());
				cursor.setAnt(outro);
			}
			cursor = cursor.getProx();
		}
	}
	public void pesquisar(int item){
		No cursor = cabeca;
		int aux = 0;
		while (cursor != null){
			if(cursor.getItem() == item){
				aux = 1;
			}
			cursor = cursor.getProx();
		}
		if(aux == 1){
			System.out.println(" Pertence a Lista");
		}else{
			System.out.println(" Não pertence a Lista");
		}
	}
}

