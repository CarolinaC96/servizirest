package it.nttdata.servizirest.controller;

import it.nttdata.servizirest.api.RandomWordApi;
import it.nttdata.servizirest.service.RandomWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
//implementa il servizio

@Controller
public class RandomWordController implements RandomWordApi {

    @Autowired
    RandomWordService randomWordService; //

    //implementazione della Get senza parametri
    @Override
    public ResponseEntity<String> getWord() {
        //dobbiamo contattare RandomWordService
        return ResponseEntity.ok(randomWordService.randomFromList());

    }

    //implementazione della Get con parametri
    @Override
    public ResponseEntity<String> getWordById(@PathVariable int id) {
        return ResponseEntity.ok(randomWordService.wordFromListById(id));
    }

    //implementazione della Post con Body
    @Override
    public ResponseEntity<String> postSortedName(@RequestBody ArrayList<String> list) {
        randomWordService.print(randomWordService.sortWord(list));

        return ResponseEntity.ok("tutto ok");
    }


}
