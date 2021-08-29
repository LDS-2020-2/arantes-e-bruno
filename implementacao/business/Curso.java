package business;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String nome;
	private int creditos;
	private List<Disciplina> obrigatorias;
	private List<Disciplina> optativas;
	
	public void addObrigatorias(Disciplina d) {
		this.obrigatorias.add(d);
	}
	public void removeObrigatorias(Disciplina d) {
		this.obrigatorias.remove(d);
	}
	public void addOptativas(Disciplina d) {
		this.optativas.add(d);
	}
	public void removeOptativas(Disciplina d) {
		this.optativas.remove(d);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public List<Disciplina> getObrigatorias() {
		return obrigatorias;
	}
	public List<Disciplina> getOptativas() {
		return optativas;
	}
	
	public Curso(String nome,int creditos) {
		this.setCreditos(creditos);
		this.setNome(nome);
		this.optativas = new ArrayList<Disciplina>();
		this.obrigatorias = new ArrayList<Disciplina>();
	}

}
