package com.megatec.backendmegatec.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.megatec.backendmegatec.model.Usuario;
import com.megatec.backendmegatec.services.UsuarioService;

@RestController

@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> obterTodos() {

        return usuarioService.obterTodos();
    }

    @GetMapping("/{id}")
    public Optional<Usuario> obterPorId(@PathVariable Integer id) {

        return usuarioService.obterPorId(id);
    }

    @PostMapping
    public Usuario adicionar(@RequestBody Usuario usuario) {

        return usuarioService.adicionar(usuario);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Integer id) {
        usuarioService.deletar(id);
        return "Usuario com id: " + id + " Deletado com Sucesso";
    }

    @PutMapping("/{id}")
    public Usuario alterar(@RequestBody Usuario usuario, @PathVariable Integer id) {
        return usuarioService.alterar(id, usuario);
    }

}