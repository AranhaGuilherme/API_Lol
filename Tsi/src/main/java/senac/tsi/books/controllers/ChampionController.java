package senac.tsi.books.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import senac.tsi.books.entities.Champion;
import senac.tsi.books.repositories.ChampionRepository;

@RestController
@RequestMapping("/champions")
public class ChampionController {

    @Autowired
    private ChampionRepository repository;

    @GetMapping
    public List<Champion> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Champion criar(@RequestBody Champion champion) {
        return repository.save(champion);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}