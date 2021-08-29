package business;

import java.util.ArrayList;
import java.util.List;

public class Oferta {
	private static final int MAX_ALUNOS = 60;
	private Disciplina disciplina;
	private List<Aluno> alunos;
	
	public void addAluno(Aluno a) {
		if(!isCheia())
			this.alunos.add(a);
	}
	public void removeAluno(Aluno a) {
		this.alunos.remove(a);
	}
	public void ativacao() {
		if(alunos.size() >=3) {
			disciplina.setAtiva(true);
		}
		else {
			disciplina.setAtiva(false);
		}
	}
	public boolean isCheia() {
		boolean lotacao = true;
		if(alunos.size() <=MAX_ALUNOS) {
			lotacao = false;
		}
		return lotacao;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	
	public Oferta(Disciplina disciplina) {
		
		this.setDisciplina(disciplina);
		alunos = new ArrayList<Aluno>();
	}
	
	
}
