package one.digitalinovationnovation.desafioexplorandopadroesprojetos.service;

import one.digitalinovationnovation.desafioexplorandopadroesprojetos.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(name = "viacep", url = "http://viacep.com.br/ws")
public interface ViaCepService {

    @RequestMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
