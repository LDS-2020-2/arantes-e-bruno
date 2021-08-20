package business;

public class Usuario {
	private String email;
	private String senha;
	private String confSenha;
	
	public boolean trocarSenha(String nova,String antiga) {
		boolean troca = false;
		if(antiga == this.senha) {
			this.setSenha(nova);
			troca = true;
		}
		return troca;
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
		if(confSenha == this.senha) {
			this.confSenha = confSenha;
			}
	}
	public Usuario(String email, String senha, String confSenha) {
		this.setEmail(email);
		this.setSenha(senha);
		this.setConfSenha(confSenha);
	}
	

}
