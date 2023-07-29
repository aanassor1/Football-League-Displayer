package mainPackage.repo;

import org.springframework.data.repository.CrudRepository;

import mainPackage.model.fixture;

public interface FixtureRepository extends CrudRepository<fixture, Integer> {

}
