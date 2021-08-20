package br.pucminas.sga.api;

public interface ICurso {
  public void addObrigatoria(IDisciplina d);

  public void removeObrigatorio(IDisciplina d);

  public void addOptativa(IDisciplina d);

  public void removeOptativa(IDisciplina d);
}
