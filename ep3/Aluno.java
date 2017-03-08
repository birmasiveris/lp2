public class Aluno implements Comparable<Aluno>{
	private String nome;
	private int idade;
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setIdade(int idade){ 
                this.idade = idade;
        }
	public String getNome(){
		return nome;
	}
	public int getIdade(){ 
                return idade;
        }
	public int compareTo(Aluno outroAluno) {
                        if (this.idade > outroAluno.getIdade()) {
                                return 1;
                        }
                        if (this.idade < outroAluno.getIdade()) {
                                return -1;
                        }
                        return 0;
                }


}
