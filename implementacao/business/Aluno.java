package business;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Aluno extends Usuario {

	private String nome;
	private long nmatricula;
	private Curso curso;
	private List<DisciplinaCursada> historico;
	private List<Disciplina> disciplinas;

	public List<Disciplina> consultarObrigatorias() {
		return disciplinas.stream().filter((f) -> curso.getObrigatorias().contains(f)).collect(toList());
	}

	public List<Disciplina> consultarOptativas() {
		return disciplinas.stream().filter((f) -> curso.getOptativas().contains(f)).collect(toList());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getNmatricula() {
		return nmatricula;
	}

	public void setNmatricula(long nmatricula) {
		this.nmatricula = nmatricula;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<DisciplinaCursada> getHistorico() {
		return historico;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void addHistorico(DisciplinaCursada d) {
		this.historico.add(d);
	}

	public void addDisciplina(Disciplina d) {
		this.disciplinas.add(d);
	}

	public void removeDisciplina(Disciplina d) {
		this.disciplinas.remove(d);
	}

	public Aluno(String email, String senha, String confSenha, String nome, long nmatricula, Curso curso) {
		super(email, senha, confSenha);
		this.setNome(nome);
		this.setNmatricula(nmatricula);

		this.setCurso(curso);
		this.historico = new ArrayList<DisciplinaCursada>();
		this.disciplinas = new ArrayList<Disciplina>();
	}

	@Override
	public Map<String, String> getFields() {
		Map<String, String> fields = super.getFields();
		fields.put("nmatricula", String.valueOf(this.nmatricula));
		fields.put("nome", this.nome);

		fields.put("curso", this.curso.getNome());

		fields.put("historico", this.historico.toString());
		fields.put("disciplinas", this.disciplinas.toString());

		return fields;
	}

	@Override
	public void loadFields(Map<String, String> fields) {
		this.nmatricula = Long.parseLong(fields.get("nmatricula"));
		this.nome = fields.get("nome");

		// TODO: this.curso = fields.get("curso");

		// TODO: this.disciplinas
		// TODO: this.historico

		super.loadFields(fields);
	}
}
