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
                e.setIdade(10);

		ArrayList<Aluno> arreio = new ArrayList<Aluno> ();
		arreio.add(a);
		arreio.add(b);
		arreio.add(c);
		arreio.add(d);
		arreio.add(e);

		Collections.sort(arreio);
		System.out.println(arreio);


	}
}
