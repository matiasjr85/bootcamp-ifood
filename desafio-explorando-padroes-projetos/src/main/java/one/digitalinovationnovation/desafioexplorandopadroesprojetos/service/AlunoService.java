package one.digitalinovationnovation.desafioexplorandopadroesprojetos.service;

import one.digitalinovationnovation.desafioexplorandopadroesprojetos.model.Aluno;

public interface AlunoService {

    Iterable<Aluno> buscarTodos();
    Aluno buscarPorId(Integer id);
    void inserir(Aluno aluno);
    void atualizar(Integer id, Aluno aluno);
    void deletar(Integer id);

}
