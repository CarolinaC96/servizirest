package it.nttdata.servizirest.repository;
import it.nttdata.servizirest.model.Clothing;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ClothingRepository extends JpaRepository<Clothing, Integer>{
}
