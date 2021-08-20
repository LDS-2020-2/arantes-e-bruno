package br.pucminas.sga.api.usuarios;

public interface IUsuario {
  public boolean trocarSenha(String nova, String antiga);
}
