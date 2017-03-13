public class Nota{
	private double valor;
	public Aluno aluno;
	private Disciplina disciplina;
	public void setValor(double valor){
		this.valor = valor;
	}
	public void setAluno(Aluno aluno){
		this.aluno = aluno;
	}
	public void setDisciplina(Disciplina disciplina){
		this.disciplina = disciplina;
	}
	public double getValor(){
		return valor;
	}
	public Aluno getAluno(){
		return aluno;
	}
	public Disciplina getDisciplina(){
		return disciplina;
	}
}
