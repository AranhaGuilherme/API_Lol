package senac.tsi.books.entities;

import jakarta.persistence.*;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String nick;
    private String role;

    public Player() {}

    public Player(String name, String nick, String role) {
        this.name = name;
        this.nick = nick;
        this.role = role;
    }

    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getNick() { return nick; }
    public void setNick(String nick) { this.nick = nick; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}