package business;

public class Matricula {
	private static int contObrigatorias =0;
	private static int contOptativas =0;
	private static final int MAX_OBRI = 4;
	private static final int MAX_OPT = 2;
	private Aluno aluno;
	
	public Matricula(Aluno aluno) {
		this.setAluno(aluno);
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public void efetuarMatricula(Oferta o) {
		if(!o.isCheia()) {
			if(aluno.getCurso().getObrigatorias().contains(o.getDisciplina()) && contObrigatorias < MAX_OBRI) {
				aluno.addDisciplina(o.getDisciplina());
				o.addAluno(aluno);
				contObrigatorias++;
			}
			else if(aluno.getCurso().getOptativas().contains(o.getDisciplina()) && contOptativas < MAX_OPT ) {
				aluno.addDisciplina(o.getDisciplina());
				o.addAluno(aluno);
				contOptativas++;
			}
		}
	}
	public void cancelarMatricula(Oferta o) {
		if(aluno.getCurso().getObrigatorias().contains(o.getDisciplina())) {
			aluno.removeDisciplina(o.getDisciplina());
			o.removeAluno(aluno);
			contObrigatorias--;
		}
		else if(aluno.getCurso().getOptativas().contains(o.getDisciplina()) ) {
			aluno.removeDisciplina(o.getDisciplina());
			o.removeAluno(aluno);
			contOptativas--;
		}
	}

}
