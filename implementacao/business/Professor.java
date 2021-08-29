package business;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Professor extends Usuario {
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

	@Override
	public Map<String, String> getFields() {
		Map<String, String> fields = super.getFields();
		fields.put("nome", this.nome);
		fields.put("disciplinas", this.disciplinas.toString());
		return fields;
	}

	@Override
	public void loadFields(Map<String, String> fields) {
		this.nome = fields.get("nome");
		// TODO: this.disciplinas

		super.loadFields(fields);
	}
}
