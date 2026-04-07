package senac.tsi.books;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import senac.tsi.books.entities.*;
import senac.tsi.books.repositories.*;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initData(
            PlayerRepository playerRepo,
            ChampionRepository championRepo,
            TeamRepository teamRepo,
            CoachRepository coachRepo,
            MatchGameRepository matchRepo) {

        return args -> {

            // Players
            playerRepo.save(new Player("Guilherme", "Kumo", "Mid"));
            playerRepo.save(new Player("Carlos", "Flash", "Jungle"));
            playerRepo.save(new Player("Ana", "Sniper", "ADC"));
            playerRepo.save(new Player("Lucas", "Tanker", "Top"));
            playerRepo.save(new Player("Bruno", "Shield", "Support"));

            // Champions
            championRepo.save(new Champion("Ahri", "Mid"));
            championRepo.save(new Champion("Lee Sin", "Jungle"));
            championRepo.save(new Champion("Jinx", "ADC"));
            championRepo.save(new Champion("Garen", "Top"));
            championRepo.save(new Champion("Thresh", "Support"));

            // Teams
            teamRepo.save(new Team("T1", "Korea"));
            teamRepo.save(new Team("G2", "Europe"));
            teamRepo.save(new Team("LOUD", "Brazil"));
            teamRepo.save(new Team("Cloud9", "NA"));
            teamRepo.save(new Team("Fnatic", "Europe"));

            // Coaches
            coachRepo.save(new Coach("Coach Kim", 10));
            coachRepo.save(new Coach("Coach EU", 7));
            coachRepo.save(new Coach("Coach BR", 5));
            coachRepo.save(new Coach("Coach NA", 6));
            coachRepo.save(new Coach("Coach KR", 12));

            // MatchGames
            matchRepo.save(new MatchGame("T1", "G2", "T1"));
            matchRepo.save(new MatchGame("LOUD", "Fnatic", "LOUD"));
            matchRepo.save(new MatchGame("Cloud9", "G2", "G2"));
            matchRepo.save(new MatchGame("T1", "LOUD", "T1"));
            matchRepo.save(new MatchGame("Fnatic", "Cloud9", "Fnatic"));
        };
    }
}