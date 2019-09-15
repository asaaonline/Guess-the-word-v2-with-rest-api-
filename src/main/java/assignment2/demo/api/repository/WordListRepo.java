package assignment2.demo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordListRepo  extends JpaRepository<Game, Integer> {

   Game findTopByOrderByIdDesc();
}
