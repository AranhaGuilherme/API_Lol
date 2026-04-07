package senac.tsi.books.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import senac.tsi.books.entities.Player;
import senac.tsi.books.repositories.PlayerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerRepository repository;

    @GetMapping
    public Page<Player> listar(Pageable pageable) {
        return repository.findAll(pageable);
    }


    @PostMapping
    public Player criar(@RequestBody Player player) {
        return repository.save(player);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}