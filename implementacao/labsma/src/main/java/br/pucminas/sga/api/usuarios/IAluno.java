package br.pucminas.sga.api.usuarios;

import br.pucminas.sga.api.IDisciplina;

public interface IAluno {
  public IDisciplina[] consultarDisciplinasObri();

  public IDisciplina[] consultarDisciplinasAlt();
}
