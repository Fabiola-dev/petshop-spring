package br.senai.lab365.exerciseweek8.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tutorpets")
public class PetController {

    @GetMapping
    public String buscarPets() {
        return "Buscar lista de pets";
    }
    @PostMapping
    public String cadastrarPets() {
        return "Cadastrar pets";
    }
    @PutMapping
    public String atualizarPets() {
        return "Atualizar pets";
    }
    public String deletarPets() {
        return "Excluir pets";
    }
}
