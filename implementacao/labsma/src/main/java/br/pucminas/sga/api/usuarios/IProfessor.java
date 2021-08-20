package br.pucminas.sga.api.usuarios;

import br.pucminas.sga.api.IDisciplina;

public interface IProfessor {
  public IAluno[] consultarAlunos(IDisciplina d);

  public void addDisciplina(IDisciplina d);

  public void removeDisciplina(IDisciplina d);
}
