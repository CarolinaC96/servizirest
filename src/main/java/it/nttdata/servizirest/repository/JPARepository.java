package it.nttdata.servizirest.repository;

import it.nttdata.servizirest.model.Clothing;
import it.nttdata.servizirest.model.Colour;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//ogni volta che facciamo un nuovo repository lo aggiungiamo qui
@Service
@RequiredArgsConstructor
public class JPARepository {

    private final ColourRepository colourRepository;
    private final ClothingRepository clothingRepository;


    //metodo per salvare
    public void saveColour(Colour colour){
        colourRepository.save(colour);
    }


    //contenitore di oggetti in cui posso passare delle operazioni che ti proteggono qualora sia nullo ?
    public Optional<Colour> findColourById(int id){
        return colourRepository.findById(id);
    }


    public List<Colour> findAllColour() {
        return colourRepository.findAll();
    }

    public void saveClothing(Clothing clothing){
        clothingRepository.save(clothing);

    }


}
