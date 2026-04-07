package senac.tsi.books.entities;

import jakarta.persistence.*;

@Entity
public class MatchGame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String teamA;
    private String teamB;
    private String winner;

    public MatchGame() {}

    public MatchGame(String teamA, String teamB, String winner) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.winner = winner;
    }

    public Long getId() { return id; }
    public String getTeamA() { return teamA; }
    public String getTeamB() { return teamB; }
    public String getWinner() { return winner; }

    public void setId(Long id) { this.id = id; }
    public void setTeamA(String teamA) { this.teamA = teamA; }
    public void setTeamB(String teamB) { this.teamB = teamB; }
    public void setWinner(String winner) { this.winner = winner; }
}