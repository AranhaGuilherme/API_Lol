package senac.tsi.books.entities;

import jakarta.persistence.*;

@Entity
public class Coach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int experience;

    public Coach() {}

    public Coach(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getExperience() { return experience; }
    public void setExperience(int experience) { this.experience = experience; }
}