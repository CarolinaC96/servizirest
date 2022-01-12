package it.nttdata.servizirest.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    //metodo che recupera un elemento casuale dall'ArrayList di colori
    public String randomFromList() {

        return colori().get(random(0,colori().size()-1));
    }

    //metodo che recupera l'iesimo elemento dell'ArrayList di colori
    public String wordFromListById( int i) {

        return colori().get(i);
    }

    //metodo che ordina in ordine alfabetico un ArrayList di stringhe
    public ArrayList<String> sortWord(ArrayList<String> list) {
        ArrayList<String> sortedlist = new ArrayList<>();
        list.sort(Comparator.naturalOrder());
        for (String s : list) {
            sortedlist.add(s);
        }

        return sortedlist;
    }

    //metodo che stampa gli elementi di un ArrayList di stringhe
    public void print(ArrayList<String> list){
        for (String s : list){
            System.out.println(s);
        }




    }
}
