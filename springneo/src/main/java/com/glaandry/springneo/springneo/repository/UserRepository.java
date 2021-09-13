package com.glaandry.springneo.springneo.repository;

import com.glaandry.springneo.springneo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.Collection;

public interface UserRepository extends Neo4jRepository<User, Long> {

    @Query("MATCH (u:User)<-[r:RATED]-(m:Movie) RETURN u,r,m") //custom query in CYPHER
    Collection<User> getAllUsers();
}
