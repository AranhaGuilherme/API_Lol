package senac.tsi.books.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import senac.tsi.books.entities.Player;
import senac.tsi.books.entities.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {}