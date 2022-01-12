package it.nttdata.servizirest.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
public class Clothing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    String type;
    String shelf;

    @ManyToOne
    @JoinColumn(name = "colour_id")
    private Colour colour;




}
