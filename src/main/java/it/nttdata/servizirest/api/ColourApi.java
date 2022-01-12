package it.nttdata.servizirest.api;

import it.nttdata.servizirest.model.Colour;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/colori")
public interface ColourApi {

    @PostMapping(
            path="/addColour"
    )
    ResponseEntity<String> postColour(@RequestBody Colour colour);

    @GetMapping(
            path="/AllColours",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    ResponseEntity<List<Colour>> getAllColours();

    @GetMapping(
            path="/Colour/{id}"
    )
    ResponseEntity<Colour> getById(@PathVariable int id);




}
