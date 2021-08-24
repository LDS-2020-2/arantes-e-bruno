package business;

public class DisciplinaCursada {
	private double nota;
	private Disciplina disciplina;
	private double presenca;
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public double getPresenca() {
		return presenca;
	}
	public void setPresenca(double presenca) {
		this.presenca = presenca;
	}
	public DisciplinaCursada(double nota, Disciplina disciplina, double presenca) {
		this.setDisciplina(disciplina);
		this.setNota(nota);
		this.setPresenca(presenca);
	}
	

}
