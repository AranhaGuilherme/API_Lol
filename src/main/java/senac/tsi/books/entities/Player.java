package senac.tsi.books.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String nick;

    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToOne
    private Team team;

    @ManyToMany
    private List<Champion> champions;

    public Player() {}

    public Player(String name, String nick, Role role) {
        this.name = name;
        this.nick = nick;
        this.role = role;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getNick() { return nick; }
    public Role getRole() { return role; }
    public Team getTeam() { return team; }
    public List<Champion> getChampions() { return champions; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setNick(String nick) { this.nick = nick; }
    public void setRole(Role role) { this.role = role; }
    public void setTeam(Team team) { this.team = team; }
    public void setChampions(List<Champion> champions) { this.champions = champions; }
}