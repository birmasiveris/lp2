import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal{
	public static void main(String[]args){
		Aluno a = new Aluno();
		a.setNome("aluno1");
		a.setIdade(10);

		Aluno b = new Aluno();
                b.setNome("aluno2");
                b.setIdade(11);

		Aluno c = new Aluno();
                c.setNome("aluno3");
                c.setIdade(12);

		Aluno d = new Aluno();
                d.setNome("aluno4");
                d.setIdade(13);

		Aluno e = new Aluno();
                e.setNome("aluno5");
                e.setIdade(14);

		Disciplina f = new Disciplina();
		f.setNome("WEB");
		f.setProfessor("Marcelo");

		Disciplina g = new Disciplina();
		g.setNome("LP2");
		g.setProfessor("Herbert");

		Nota h = new Nota();
		h.setValor(10);
		h.setAluno(a);
		h.setDisciplina(f);

		ArrayList<Nota> arrei = new ArrayLista<Nota> ();
		arrei.add(h);

		ArrayList<Aluno> arreio = new ArrayList<Aluno> ();
		arreio.add(a);
		arreio.add(b);
		arreio.add(c);
		arreio.add(d);
		arreio.add(e);

		Collections.sort(arreio);
		for (int i=0; i<5; i++){
			System.out.println(arreio.get(i).getNome() + " " + arreio.get(i).getIdade());
		}


	}
}
