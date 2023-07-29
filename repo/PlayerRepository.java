package mainPackage.repo;

import org.springframework.data.repository.CrudRepository;

import mainPackage.model.player;
public interface PlayerRepository extends CrudRepository<player, Integer> {

	public player findByName(String name);
	
}
