package mainPackage.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class league {
	@Id
	@GeneratedValue
	private Integer league_id;
	private String name;
	@ManyToMany
	@JoinColumn
	private List<team> teams;
	
	public Integer getLeague_id() {
		return league_id;
		
	}
	public void setLeague_id(Integer league_id) {
		this.league_id = league_id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<team> getTeams() {
		return teams;
	}
	
	public void setTeams(List<team> teams) {
		this.teams = teams;
	}
	
	public String toString() {
		String output = "";
		output += "Id = " + league_id + "; Name = " + name + "; Teams = [";
		for (team t : teams) {
		   output += t.getName() + ", ";
		} 
		output = output.substring(0, output.length() - 2);
		output += "]";
		return output;
	}
	
}
