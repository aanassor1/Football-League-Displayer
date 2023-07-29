package mainPackage;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mainPackage.model.fixture;
import mainPackage.model.league;
import mainPackage.model.player;
import mainPackage.model.stats;
import mainPackage.model.team;
import mainPackage.repo.FixtureRepository;
import mainPackage.repo.LeagueRepository;
import mainPackage.repo.PlayerRepository;
import mainPackage.repo.StatsRepository;
import mainPackage.repo.TeamRepository;

@SpringBootApplication
public class Hw2Application implements ApplicationRunner {
	
	@Autowired
	private PlayerRepository playerRepo;
	@Autowired
	private FixtureRepository fixtureRepo;
	@Autowired
	private TeamRepository teamRepo;
	@Autowired
	private StatsRepository statsRepo;
	@Autowired
	private LeagueRepository leagueRepo;

	public static void main(String[] args) {
		SpringApplication.run(Hw2Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		//Teams
		team t1 = new team();
		t1.setName("Real Madrid");
		t1.setPoints(3);
		t1 = teamRepo.save(t1);
		
		team t2 = new team();
		t2.setName("Barcelona");
		t2.setPoints(0);
		t2 = teamRepo.save(t2);
		
		team t3 = new team();
		t3.setName("Free Agent");
		t3.setPoints(0);
		t3 = teamRepo.save(t3);
		
		//Players
		player p1 = new player();
		p1.setName("Lionel Messi");
		p1 = playerRepo.save(p1);
		
		player p2 = new player();
		p2.setName("Neymar Jr");
		p2 = playerRepo.save(p2);
		
		//Stats
		stats s1 = new stats();
		s1.setAttack(97);
		s1.setDefence(42);
		s1.setOverall(70);
		s1.setPlayer(p1);
		s1 = statsRepo.save(s1);
		
		stats s2 = new stats();
		s2.setAttack(94);
		s2.setDefence(38);
		s2.setOverall(66);
		s2.setPlayer(p2);
		s2 = statsRepo.save(s2);
		
		p1.setTeam(teamRepo.findByName("Barcelona"));
		p1.setStats(s1);
		p1 = playerRepo.save(p1);
		
		p2.setTeam(teamRepo.findByName("Barcelona"));
		p2.setStats(s2);
		p2 = playerRepo.save(p2);
		
		//Fixtures
		fixture f1 = new fixture();
		f1.setTeams(new ArrayList<>());
		f1.getTeams().add(t1);
		f1.getTeams().add(t2);
		f1.setStadium("Camp Nou");
		f1.setTeam1_score(3);
		f1.setTeam2_score(4);
		f1 = fixtureRepo.save(f1);
		
		//Leagues
		league l1 = new league();
		l1.setName("La Liga");
		l1.setTeams(new ArrayList<>());
		l1.getTeams().add(t1);
		l1.getTeams().add(t2);
		l1 = leagueRepo.save(l1);
		
		league l2 = new league();
		l2.setName("Champions League");
		l2.setTeams(new ArrayList<>());
		l2.getTeams().add(t1);
		l2.getTeams().add(t2);
		l2 = leagueRepo.save(l2);
		
		t1.setParticipated_leagues(new ArrayList<>());
		t1.getParticipated_leagues().add(l1);
		t1.getParticipated_leagues().add(l2);
		t1 = teamRepo.save(t1);
		
		t2.setParticipated_leagues(new ArrayList<>());
		t2.getParticipated_leagues().add(l1);
		t2.getParticipated_leagues().add(l2);
		t2 = teamRepo.save(t2);

	}

}
