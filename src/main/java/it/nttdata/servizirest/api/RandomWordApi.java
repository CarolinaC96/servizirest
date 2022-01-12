package it.nttdata.servizirest.api;

//questo potremmo metterlo nel controller ma separiamo le cose per avere classi più piccole
//nella classe API facciamo la mappatura servizi REST (dare indirizzi ad ogni end-poit), esponendo il servizio

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


@RequestMapping("/randomWord")
public interface RandomWordApi {

//Get
    @GetMapping(
            path="/hello",
           produces = MediaType.TEXT_PLAIN_VALUE // indica il formato del dato restituito
    )
    ResponseEntity<String> getWord();

//Get con parametri nell'URL --> http://localhost:8080/randomWord/hello/id
    @GetMapping(
            path="/hello/{id}",
            produces = MediaType.TEXT_PLAIN_VALUE

    )
    ResponseEntity<String> getWordById(@PathVariable int id);

//Post con Body
    @PostMapping(
            path="/sort"
    )
    ResponseEntity<String> postSortedName(@RequestBody ArrayList<String> list);



}


