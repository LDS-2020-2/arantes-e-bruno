package business;

public class Disciplina {
	private String nome;
	private boolean ativa;
	private String ementa;
	private Professor professor;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public String getEmenta() {
		return ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Disciplina(String nome, boolean ativa, String ementa, Professor professor) {
		
		this.setNome(nome);
		this.setAtiva(ativa);;
		this.setEmenta(ementa);
		this.setProfessor(professor);
	}
	@Override
	public String toString(){
		return "Nome: "+this.nome+", ementa: "+this.ementa+", professor: "+this.professor.toString()+"\n";
	}
	
	

}
