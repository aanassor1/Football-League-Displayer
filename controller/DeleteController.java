package mainPackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mainPackage.repo.FixtureRepository;
import mainPackage.repo.LeagueRepository;
import mainPackage.repo.PlayerRepository;
import mainPackage.repo.StatsRepository;
import mainPackage.repo.TeamRepository;

@Controller
public class DeleteController {

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
	
	@RequestMapping(value = "/delete{class}")
	public String list(@PathVariable("class") String selectedClass, @RequestParam("id") Integer id, Model model) {
		System.out.println(selectedClass);
		switch (selectedClass) {
			case "player":
				if (playerRepo.findById(id).isPresent()) {
					playerRepo.delete(playerRepo.findById(id).get());
		        }
			case "fixture":
				if (fixtureRepo.findById(id).isPresent()) {
					fixtureRepo.delete(fixtureRepo.findById(id).get());
		        }
			case "team":
				if (teamRepo.findById(id).isPresent()) {
					teamRepo.delete(teamRepo.findById(id).get());
		        }
			case "stats":
				if (statsRepo.findById(id).isPresent()) {
					statsRepo.delete(statsRepo.findById(id).get());
		        }
			case "league":
				if (leagueRepo.findById(id).isPresent()) {
					leagueRepo.delete(leagueRepo.findById(id).get());
		        }
		}
        return "redirect:/list";
	}

}
