package br.com.cadastrousuario.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/usuarios")
public class UsuarioController {

    /**
     * [modificador de acesso] [retorno da função] [nome da função]
     */
    @GetMapping
    public String criarUsuario() {
        return "testando api";
    }

}
