package one.digitalinovationnovation.desafioexplorandopadroesprojetos.service.implement;

import one.digitalinovationnovation.desafioexplorandopadroesprojetos.model.*;
import one.digitalinovationnovation.desafioexplorandopadroesprojetos.service.FuncionarioService;
import one.digitalinovationnovation.desafioexplorandopadroesprojetos.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
public class FuncionarioServiceImplement implements FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Funcionario> buscarTodos() {

        return funcionarioRepository.findAll();
    }

    @Override
    public Funcionario buscarPorId(Integer id) {
        Optional<Funcionario> funcionario = funcionarioRepository.findById(id);
        return funcionario.get();
    }

    @Override
    public void inserir(Funcionario funcionario) {
        salvarFuncionarioComCep(funcionario);

    }



    private void salvarAlunoComCep(Funcionario funcionario) {
        salvarFuncionarioComCep(funcionario);
    }

    private void salvarFuncionarioComCep(Funcionario funcionario) {
        String cep = funcionario.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(funcionario.getEndereco().getCep()).orElseGet(() ->{
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;

        });
        funcionario.setEndereco(endereco);
        funcionarioRepository.save(funcionario);
    }

    @Override
    public void atualizar(Integer id, Funcionario funcionario) {
        Optional<Funcionario> alunoBd = funcionarioRepository.findById(id);
        if (alunoBd.isPresent()){
            salvarAlunoComCep(funcionario);

        }

    }

    @Override
    public void deletar(Integer id) {

        funcionarioRepository.deleteAllById(Collections.singleton(id));

    }
}
