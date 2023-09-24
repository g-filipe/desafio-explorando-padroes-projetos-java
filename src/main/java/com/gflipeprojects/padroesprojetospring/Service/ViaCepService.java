package com.gflipeprojects.padroesprojetospring.Service;

import com.gflipeprojects.padroesprojetospring.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Cliente HTTP, criado via <b>OpenFeing</b>, para consumo da API do
 * <b>VIACEP</b>
 *
 * @see <a href="https://spring.io/projects/spring-cloud-openfeing">Srping Cloud Open Feing</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 *
 * @author Filipe Galvao
 */
@FeignClient(name ="viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);

}
