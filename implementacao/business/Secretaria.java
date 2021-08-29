package business;

import java.util.ArrayList;
import java.util.List;

public class Secretaria {
	private List<Usuario> usuarios;
	private List<Disciplina> disciplinas;
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public Secretaria() {
		usuarios = new ArrayList<Usuario>();
		disciplinas = new ArrayList<>();
	}
	public void cadastraDisc(Disciplina d) {
		disciplinas.add(d);
	}
	public void cadastrarUsuario(Usuario u) {
		usuarios.add(u);
	}
	public void removeUsuario(Usuario u) {
		usuarios.remove(u);
	}
	

}
