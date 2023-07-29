package mainPackage.repo;

import org.springframework.data.repository.CrudRepository;

import mainPackage.model.league;

public interface LeagueRepository extends CrudRepository<league, Integer> {

}
