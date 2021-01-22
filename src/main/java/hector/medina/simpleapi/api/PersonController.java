package hector.medina.simpleapi.api;

import hector.medina.simpleapi.model.Person;
import hector.medina.simpleapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    public void addPerson(Person person){
        personService.addPerson(person);
    }
}
