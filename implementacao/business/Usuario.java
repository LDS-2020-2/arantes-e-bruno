package business;

import java.util.HashMap;
import java.util.Map;

import business.data.Storable;

public class Usuario implements Storable {
	private String email;
	private String senha;
	private String confSenha;

	public boolean trocarSenha(String nova, String antiga) {
		if (!this.senha.equals(antiga)) {
			return false;
		}

		this.setSenha(nova);
		return true;
	}

	public boolean efetuarLogin(String email, String senha) {
		return this.email.equals(email) && this.senha.equals(senha);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfSenha() {
		return confSenha;
	}

	public void setConfSenha(String confSenha) {
		if (this.senha.equals(confSenha)) {
			this.confSenha = confSenha;
		}
	}

	public Usuario(String email, String senha, String confSenha) {
		this.setEmail(email);
		this.setSenha(senha);
		this.setConfSenha(confSenha);
	}

	@Override
	public String getFileName() {
		return this.email;
	}

	@Override
	public Map<String, String> getFields() {
		Map<String, String> fields = new HashMap<>();
		fields.put("email", this.email);
		fields.put("senha", this.senha);
		fields.put("confSenha", this.confSenha);

		return fields;
	}

	@Override
	public void loadFields(Map<String, String> fields) {
		this.setEmail(fields.get("email"));
		this.setSenha(fields.get("senha"));
		this.setConfSenha(fields.get("confSenha"));
	}

}
