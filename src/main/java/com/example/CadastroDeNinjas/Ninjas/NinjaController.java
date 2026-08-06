package com.example.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Minha primeira mensagem nessa rota";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criarNinja")
    public String criarNinja() {
        return "Ninja criado";
    }


    // Mostrar todos os ninjas (READ)
    @GetMapping("/todosNinjas")
    public List<NinjaModel> listarTodosNinjas() {
        return ninjaService.listarTodosNinjas();
    }

    // Mostrar ninja por id (READ)
    @GetMapping("/ninjaID")
    public String mostrarNinjaPorId() {
        return "Mostrar ninja por ID";
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarNinjaID")
    public String alterarNinjaPorID() {
        return "Ninja alterado";
    }

    //Deletar ninja (DELETE)
    @DeleteMapping("/deletarNinjaID")
    public String deletarNinjaID() {
        return "Ninja deletado";
    }




}
