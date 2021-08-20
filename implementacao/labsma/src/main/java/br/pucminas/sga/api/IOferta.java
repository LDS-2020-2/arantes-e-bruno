package br.pucminas.sga.api;

import br.pucminas.sga.api.usuarios.IAluno;

public interface IOferta {
  public void addAluno(IAluno a);

  public void removeAluno(IAluno a);
}
