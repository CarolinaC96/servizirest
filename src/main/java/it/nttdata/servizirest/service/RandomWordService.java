package it.nttdata.servizirest.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class RandomWordService {
//logica

    private int random(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    private ArrayList<String> colori(){
        ArrayList<String> list = new ArrayList<String>(); //lista di stinghe vuota
        String[] colori= {
                "rosso",
                "blu",
                "verde",
                "nero",
                "giallo",
                "bianco"
        };

        Collections.addAll(list, colori);
        return list;
    }
    public String randomFromList() {

        return colori().get(random(0,colori().size()-1));
    }


    public String wordFromListById( int i) {

        return colori().get(i);
    }


}
