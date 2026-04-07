package senac.tsi.books.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import senac.tsi.books.entities.Coach;
import senac.tsi.books.repositories.CoachRepository;

@RestController
@RequestMapping("/coaches")
public class CoachController {

    @Autowired
    private CoachRepository repository;

    @GetMapping
    public List<Coach> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Coach criar(@RequestBody Coach coach) {
        return repository.save(coach);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}