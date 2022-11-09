package one.digitalinovationnovation.desafioexplorandopadroesprojetos.controller;

import one.digitalinovationnovation.desafioexplorandopadroesprojetos.model.Aluno;
import one.digitalinovationnovation.desafioexplorandopadroesprojetos.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("alunos")
public class AlunoRestController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public ResponseEntity<Iterable<Aluno>> buscarTodos() {
        return ResponseEntity.ok(alunoService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> buscarPorId(@PathVariable Integer id) {
        return ResponseEntity.ok(alunoService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Aluno> inserir(@RequestBody Aluno cliente) {
        alunoService.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluno> atualizar(@PathVariable Integer id, @RequestBody Aluno cliente) {
        alunoService.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        alunoService.deletar(id);
        return ResponseEntity.ok().build();

    }
}