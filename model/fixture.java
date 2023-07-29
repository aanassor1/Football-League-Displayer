package mainPackage.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class fixture {
	@Id
	@GeneratedValue
	private Integer fixture_id;
	@OneToMany(orphanRemoval = true, cascade = CascadeType.REMOVE, targetEntity = team.class)
	private List<team> teams;
	private String stadium;
	private Integer team1_score;
	private Integer team2_score;
	
	public Integer getFixture_id() {
		return fixture_id;
	}

	public void setFixture_id(Integer fixture_id) {
		this.fixture_id = fixture_id;
	}

	public List<team> getTeams() {
		return teams;
	}

	public void setTeams(List<team> team_id) {
		this.teams = team_id;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	public Integer getTeam1_score() {
		return team1_score;
	}

	public void setTeam1_score(Integer team1_score) {
		this.team1_score = team1_score;
	}

	public Integer getTeam2_score() {
		return team2_score;
	}

	public void setTeam2_score(Integer team2_score) {
		this.team2_score = team2_score;
	}

	public String toString() {
		String output = "";
		output += "Id = " + fixture_id + "; Team 1 = " + teams.get(0).getName() + " vs Team 2 = " + teams.get(1).getName() + "; Stadium = " + stadium + "; Team 1 Score = " + team1_score + "; Team 2 Score = " + team2_score; 
		return output;
	}
	
}
