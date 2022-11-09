package one.digitalinovationnovation.desafioexplorandopadroesprojetos.controller;


import one.digitalinovationnovation.desafioexplorandopadroesprojetos.model.Funcionario;
import one.digitalinovationnovation.desafioexplorandopadroesprojetos.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("funcionarios")
public class FuncionarioRestController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public ResponseEntity<Iterable<Funcionario>> buscarTodos() {
        return ResponseEntity.ok(funcionarioService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> buscarPorId(@PathVariable Integer id) {
        return ResponseEntity.ok(funcionarioService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Funcionario> inserir(@RequestBody Funcionario funcionario) {
        funcionarioService.inserir(funcionario);
        return ResponseEntity.ok(funcionario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Funcionario> atualizar(@PathVariable Integer id, @RequestBody Funcionario funcionario) {
        funcionarioService.atualizar(id, funcionario);
        return ResponseEntity.ok(funcionario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        funcionarioService.deletar(id);
        return ResponseEntity.ok().build();

    }
}