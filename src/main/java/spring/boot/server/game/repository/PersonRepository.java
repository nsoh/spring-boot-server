package spring.boot.server.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import spring.boot.server.game.entity.Person;

import java.util.List;
import java.util.UUID;

@Repository
public interface PersonRepository extends JpaRepository<Person, UUID> {
    @Query(value = "SELECT * FROM defaultdb.person", nativeQuery = true)
    List<Person> getLstPerson();

    @Query(value = "SELECT * FROM defaultdb.person WHERE user_id =:user_id", nativeQuery = true)
    Person getPersonByUserId(@Param("user_id") Integer userId);
}
