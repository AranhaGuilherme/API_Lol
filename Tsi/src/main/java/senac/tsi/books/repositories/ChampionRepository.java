package senac.tsi.books.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import senac.tsi.books.entities.Champion;
import senac.tsi.books.entities.Player;

public interface ChampionRepository extends JpaRepository<Champion, Long> {}