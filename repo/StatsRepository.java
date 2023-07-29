package mainPackage.repo;

import org.springframework.data.repository.CrudRepository;

import mainPackage.model.stats;

public interface StatsRepository extends CrudRepository<stats, Integer> {

}
