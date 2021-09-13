package com.glaandry.springneo.springneo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Node("User")
public class User {

    @Id
    private Long id;
    private String name;
    private Integer age;

}
