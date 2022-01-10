package it.nttdata.servizirest.api;

import it.nttdata.servizirest.model.Person;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/person")
public interface PersonApi {

    @PostMapping (
            path="/addperson",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    ResponseEntity<String> postPerson(@RequestBody Person person);


}
