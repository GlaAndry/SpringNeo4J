package com.glaandry.springneo.springneo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Node("Movie") //identifica il nodo in neo4j e gli assegna il nome
public class Movie {

    @Id //vecchio GraphId
    private Long id;
    private String title;
    private String director;

    //tipologia di relazione
    //incoming identifica una relazione che entra all'interno del nodo
    @Relationship(type = "RATED", direction = Relationship.Direction.INCOMING)
    private List<Movie> movieList;

}
