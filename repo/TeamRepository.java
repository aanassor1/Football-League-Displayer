package mainPackage.repo;

import org.springframework.data.repository.CrudRepository;

import mainPackage.model.team;

public interface TeamRepository extends CrudRepository<team, Integer> {
	
	public team findByName(String name);
	
}
