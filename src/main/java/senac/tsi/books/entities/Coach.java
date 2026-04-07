package senac.tsi.books.entities;

import jakarta.persistence.*;

@Entity
public class Coach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int experience;

    @OneToOne(mappedBy = "coach")
    private Team team;

    public Coach() {}

    public Coach(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public int getExperience() { return experience; }
    public Team getTeam() { return team; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setExperience(int experience) { this.experience = experience; }
    public void setTeam(Team team) { this.team = team; }
}