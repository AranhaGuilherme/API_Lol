package senac.tsi.books.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String region;

    @OneToMany(mappedBy = "team")
    private List<Player> players;

    @OneToOne
    private Coach coach;

    public Team() {}

    public Team(String name, String region) {
        this.name = name;
        this.region = region;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getRegion() { return region; }
    public List<Player> getPlayers() { return players; }
    public Coach getCoach() { return coach; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setRegion(String region) { this.region = region; }
    public void setPlayers(List<Player> players) { this.players = players; }
    public void setCoach(Coach coach) { this.coach = coach; }
}