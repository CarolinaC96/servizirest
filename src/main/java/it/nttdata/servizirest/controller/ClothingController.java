package it.nttdata.servizirest.controller;

import it.nttdata.servizirest.api.ClothingAPI;
import it.nttdata.servizirest.model.Clothing;
import it.nttdata.servizirest.repository.JPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ClothingController implements ClothingAPI {

    private final JPARepository jpaRepository;


    @Override
    public ResponseEntity<String> postClothing(Clothing clothing) {
        clothing.setColour(jpaRepository.findColourById((int)Math.random()*2).get());
        jpaRepository.saveClothing(clothing);
        return ResponseEntity.ok("vestito aggiunto!");
    }

}
