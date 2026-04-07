package senac.tsi.books.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import senac.tsi.books.entities.MatchGame;
import senac.tsi.books.repositories.MatchGameRepository;

@RestController
@RequestMapping("/matchgames")
public class MatchGameController {

    @Autowired
    private MatchGameRepository repository;

    @GetMapping
    public List<MatchGame> listar() {
        return repository.findAll();
    }

    @PostMapping
    public MatchGame criar(@RequestBody MatchGame match) {
        return repository.save(match);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}