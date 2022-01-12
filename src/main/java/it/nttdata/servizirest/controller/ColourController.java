package it.nttdata.servizirest.controller;

import it.nttdata.servizirest.api.ColourApi;
import it.nttdata.servizirest.model.Colour;
import it.nttdata.servizirest.repository.ColourRepository;
import it.nttdata.servizirest.repository.JPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RequiredArgsConstructor//genera i costruttori dei paramentri obbligatori (ovvero quelli final) al posto di Autowired
@Controller
public class ColourController implements ColourApi {


    private final JPARepository jpaRepository;
    private final ColourRepository colourRepository;

    @Override
    public ResponseEntity<String> postColour(@RequestBody Colour c) {
        jpaRepository.saveColour(c);
        return ResponseEntity.ok("Colore aggiunto");
    }

    @Override
    public ResponseEntity<List<Colour>> getAllColours() {
        return ResponseEntity.ok(jpaRepository.findAllColour());

    }

    @Override
    public ResponseEntity<Colour> getById(int id) {

        return ResponseEntity.ok(jpaRepository.findColourById(id).get());
    }



}
