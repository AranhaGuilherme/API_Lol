package senac.tsi.books.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Champion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String role;

    @ManyToMany(mappedBy = "champions")
    private List<Player> players;

    public Champion() {}

    public Champion(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getRole() { return role; }
    public List<Player> getPlayers() { return players; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setRole(String role) { this.role = role; }
    public void setPlayers(List<Player> players) { this.players = players; }
}