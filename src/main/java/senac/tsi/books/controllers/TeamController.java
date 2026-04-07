package senac.tsi.books.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import senac.tsi.books.entities.Team;
import senac.tsi.books.repositories.TeamRepository;

@RestController
@RequestMapping("/teams")
public class TeamController {

    @Autowired
    private TeamRepository repository;

    @GetMapping
    public List<Team> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Team criar(@RequestBody Team team) {
        return repository.save(team);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}