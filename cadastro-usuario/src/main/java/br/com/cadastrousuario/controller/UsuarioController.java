package br.com.cadastrousuario.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController: Anotação do Spring responsável por indicar classe controller
 * RequestMapping: Anotação do Spring responsável por mapear o caminho (path) da requisição
 */
@RestController
@RequestMapping("/v1/usuarios")
public class UsuarioController {

    /**
     * [modificador de acesso] [retorno da função] [nome da função]
     * GetMapping: Anotação do Spring responsável por definir qual verbo HTTP será utilizado na requisição
     */
    @GetMapping
    public String criarUsuario() {
        return "testando api";
    }

}
