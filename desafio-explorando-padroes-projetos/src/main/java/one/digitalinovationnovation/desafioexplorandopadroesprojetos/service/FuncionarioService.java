package one.digitalinovationnovation.desafioexplorandopadroesprojetos.service;

import one.digitalinovationnovation.desafioexplorandopadroesprojetos.model.Aluno;
import one.digitalinovationnovation.desafioexplorandopadroesprojetos.model.Funcionario;

public interface FuncionarioService {

    Iterable<Funcionario> buscarTodos();
    Funcionario buscarPorId(Integer id);
    void inserir(Funcionario funcionario);
    void atualizar(Integer id, Funcionario funcionario);
    void deletar(Integer id);

}
