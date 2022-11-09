package one.digitalinovationnovation.desafioexplorandopadroesprojetos.service.implement;

import one.digitalinovationnovation.desafioexplorandopadroesprojetos.model.Aluno;
import one.digitalinovationnovation.desafioexplorandopadroesprojetos.model.AlunoRepository;
import one.digitalinovationnovation.desafioexplorandopadroesprojetos.model.Endereco;
import one.digitalinovationnovation.desafioexplorandopadroesprojetos.model.EnderecoRepository;
import one.digitalinovationnovation.desafioexplorandopadroesprojetos.service.AlunoService;
import one.digitalinovationnovation.desafioexplorandopadroesprojetos.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
public class AlunoServiceImplement implements AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Aluno> buscarTodos() {

        return alunoRepository.findAll();
    }

    @Override
    public Aluno buscarPorId(Integer id) {
        Optional<Aluno> aluno = alunoRepository.findById(id);
        return aluno.get();
    }

    @Override
    public void inserir(Aluno aluno) {
        salvarAlunoCep(aluno);

    }


    private void savarAlunoCep(Aluno aluno) {
        salvarAlunoCep(aluno);
    }

    private void salvarAlunoCep(Aluno aluno) {
        String cep = aluno.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(aluno.getEndereco().getCep()).orElseGet(() ->{
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;

        });
        aluno.setEndereco(endereco);
        alunoRepository.save(aluno);
    }

    @Override
    public void atualizar(Integer id, Aluno aluno) {
        Optional<Aluno> alunoBd = alunoRepository.findById(id);
        if (alunoBd.isPresent()){
            salvarAlunoCep(aluno);

        }

    }

    @Override
    public void deletar(Integer id) {

        alunoRepository.deleteAllById(Collections.singleton(id));

    }
}


