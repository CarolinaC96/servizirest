package it.nttdata.servizirest.controller;

import it.nttdata.servizirest.api.PersonApi;
import it.nttdata.servizirest.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PersonController implements PersonApi {


    @Override
    public ResponseEntity<String> postPerson(@RequestBody Person person) {
        System.out.println(person.getName()+" "+ person.getSurname());
        return ResponseEntity.ok("tutto ok");

    }
}
