package business;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Usuario{
	private String nome;
	private List<Disciplina> disciplinas;
	
	public void addDisciplina(Disciplina d) {
		this.disciplinas.add(d);
	}
	public void removeDisciplina(Disciplina d) {
		this.disciplinas.remove(d);
	}
	public Professor(String email, String senha, String confSenha, String nome) {
		super(email, senha, confSenha);
		this.setNome(nome);
		disciplinas = new ArrayList<Disciplina>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	

}
