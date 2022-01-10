package it.nttdata.servizirest.controller;
import it.nttdata.servizirest.api.RandomWordApi;
import it.nttdata.servizirest.service.RandomWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
//implementa il servizio

@Controller
public class RandomWordController implements RandomWordApi {

    @Autowired
    RandomWordService randomWordService; //

    @Override
    public ResponseEntity<String> getWord() {
        //dobbiamo contattare RandomWordService
        return ResponseEntity.ok(randomWordService.randomFromList());


    }

    @Override
    public ResponseEntity<String> getWordById(@PathVariable int id) {
        return ResponseEntity.ok(randomWordService.wordFromListById(id));
    }


}
