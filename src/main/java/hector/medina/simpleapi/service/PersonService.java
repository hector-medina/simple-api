package hector.medina.simpleapi.service;

import hector.medina.simpleapi.dao.PersonDao;
import hector.medina.simpleapi.model.Person;

public class PersonService {
    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }
}
