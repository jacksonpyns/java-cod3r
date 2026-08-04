package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nome;
	final List<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome) {// Construtor
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso){ // Método
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Curso obterCursoPorNome(String nome) {
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
	
// Será usado este Método sempre que quiser converter um Objeto para o formato String
	public String toString() {
		return "O meu nome é " + nome;
	}
}
