package mainPackage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class stats {
	@Id
	@GeneratedValue
	private Integer stats_id;
	@OneToOne(targetEntity = player.class)
	private player player;
	private Integer attack;
	private Integer defence;
	private Integer overall;
	
	public Integer getStats_id() {
		return stats_id;
	}
	
	public void setStats_id(Integer stats_id) {
		this.stats_id = stats_id;
	}
	
	public player getPlayer() {
		return player;
	}
	
	public void setPlayer(player player) {
		this.player = player;
	}
	
	public Integer getAttack() {
		return attack;
	}
	
	public void setAttack(Integer attack) {
		this.attack = attack;
	}
	
	public Integer getDefence() {
		return defence;
	}
	
	public void setDefence(Integer defence) {
		this.defence = defence;
	}
	
	public Integer getOverall() {
		return overall;
	}
	
	public void setOverall(Integer overall) {
		this.overall = overall;
	}
	
	public String toString() {
		String output = "";
		output += "Id = " + stats_id + "; Player Name = " + player.getName() + "; Attack = " + attack + "; Defence = " + defence + "; Overall = " + overall;
		return output;
	}
	
}
