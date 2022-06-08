package spring.boot.server.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.server.game.entity.Person;
import spring.boot.server.game.repository.PersonRepository;

import java.util.List;

@RestController
public class ApiController {

    private final PersonRepository personRepository;

    @Autowired
    public ApiController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/PersonList")
    public List<Person> getPersonList() {
        return personRepository.getLstPerson();
    }

    @GetMapping("/Person/{userId}")
    public Person getPersonByUserId(@PathVariable("userId") Integer userId) throws Exception {
        Person person = personRepository.getPersonByUserId(userId);
        if (person == null) {
            throw new Exception();
        }

        return person;
    }


}
