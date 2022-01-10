package it.nttdata.servizirest.api;

//questo potremmo metterlo nel controller ma separiamo le cose per avere classi più piccole
//nella classe API facciamo la mappatura servizi REST (dare indirizzi ad ogni end-poit)

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//espone il servizio

@RequestMapping("/randomWord")
public interface RandomWordApi {


    @GetMapping(
            path="/hello",
           produces = MediaType.TEXT_PLAIN_VALUE // indica il formato del dato restituito
    )
    ResponseEntity<String> getWord();


    @GetMapping(
            path="/hello/{id}",
            produces = MediaType.TEXT_PLAIN_VALUE

    )
    ResponseEntity<String> getWordById(@PathVariable int id);
}


