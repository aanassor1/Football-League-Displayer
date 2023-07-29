package mainPackage.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class player {
	@Id
	@GeneratedValue
	private Integer player_id;
	private String name;
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = team.class)
	private team team;
	@OneToOne(targetEntity = stats.class, orphanRemoval=true)
	private stats stats;
	
	public Integer getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(Integer player_id) {
		this.player_id = player_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public team getTeam() {
		return team;
	}

	public void setTeam(team team) {
		this.team = team;
	}

	public stats getStats() {
		return stats;
	}

	public void setStats(stats stats) {
		this.stats = stats;
	}

	public String toString() {
		String output = "";
		output += "Id = " + player_id + "; Name = " + name + "; Team = " + team.getName() + "; Stats Id = " + stats.getStats_id();
		return output;
	}
	
}
