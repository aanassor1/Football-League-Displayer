package mainPackage.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class team {
	@Id
	@GeneratedValue
	private Integer team_id;
	private String name;
	private Integer points;
	@ManyToMany(mappedBy = "teams")
	private List<league> participated_leagues;
	
	public Integer getTeam_id() {
		return team_id;
	}

	public void setTeam_id(Integer team_id) {
		this.team_id = team_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public List<league> getParticipated_leagues() {
		return participated_leagues;
	}

	public void setParticipated_leagues(List<league> participated_leagues) {
		this.participated_leagues = participated_leagues;
	}

	public String toString() {
		String output = "";
		output += "Id = " + team_id + "; Name = " + name + "; Points = " + points + "; Leagues = [";
		for (league l : participated_leagues) {
		   output += l.getName() + ", ";
		} 
		output = output.substring(0, output.length() - 2);
		output += "]";
		return output;
	}
	
}
