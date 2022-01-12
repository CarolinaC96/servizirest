package it.nttdata.servizirest.repository;

import it.nttdata.servizirest.model.Colour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface ColourRepository extends JpaRepository<Colour,Integer> {



}
