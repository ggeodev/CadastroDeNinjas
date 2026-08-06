package com.example.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MissoesController {
    // Adicionar missão (CREATE)
    @PostMapping("/criarMissao")
    public String criarMissao() {
        return "Missão criada";
    }

    // Mostrar todos as missões (READ)
    @GetMapping("/todasMissoes")
    public String mostrarTodasMissoes() {
        return "Mostrar missões";
    }

    // Mostrar missão por ID (READ)
    @GetMapping("/MissaoID")
    public String mostrarMissaoPorId() {
        return "Mostrar missão por ID";
    }

    // Alterar dados das missões (UPDATE)
    @PutMapping("/alterarMissaoID")
    public String alterarMissaoPorID() {
        return "Missão alterada";
    }

    //Deletar missão (DELETE)
    @DeleteMapping("/deletarMissaoID")
    public String deletarMissaoID() {
        return "Missão deletada";
    }

}
