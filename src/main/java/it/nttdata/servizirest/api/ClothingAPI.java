package it.nttdata.servizirest.api;

import it.nttdata.servizirest.model.Clothing;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/clothing")
public interface ClothingAPI {


    @PostMapping(
            path = "/addClothing"
    )
    ResponseEntity<String> postClothing(@RequestBody Clothing clothing);

}
