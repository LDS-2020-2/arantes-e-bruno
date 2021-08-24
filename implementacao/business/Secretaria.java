package business;

import java.util.ArrayList;
import java.util.List;

public class Secretaria {
	private List<Usuario> usuarios;

	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
	private Secretaria() {
		usuarios = new ArrayList<Usuario>();
	}
	
	public void cadastrarUsuario(Usuario u) {
		usuarios.add(u);
	}
	public void removeUsuario(Usuario u) {
		usuarios.remove(u);
	}
	

}
