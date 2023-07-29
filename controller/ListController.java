package mainPackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mainPackage.repo.FixtureRepository;
import mainPackage.repo.LeagueRepository;
import mainPackage.repo.PlayerRepository;
import mainPackage.repo.StatsRepository;
import mainPackage.repo.TeamRepository;

@Controller
public class ListController {

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
	
	@RequestMapping(value = "/list")
	public String list(Model model) {
		model.addAttribute("leagues", leagueRepo.findAll());
		model.addAttribute("teams", teamRepo.findAll());
		model.addAttribute("stats", statsRepo.findAll());
		model.addAttribute("players", playerRepo.findAll());
		model.addAttribute("fixtures", fixtureRepo.findAll());
		return "list";
	}

}
