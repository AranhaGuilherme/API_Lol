package senac.tsi.books.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import senac.tsi.books.entities.MatchGame;

public interface MatchGameRepository extends JpaRepository<MatchGame, Long> {}