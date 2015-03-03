package com.sofi.models.dao;

import com.sofi.models.Movie;
import com.sofi.models.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieDao extends CrudRepository<Movie, Long> {
    Movie findByName(String moviename);
    Movie findById(Long id);

    @Query(value = "select max(id) from Movie")
    Long findMaxID();
    
    @Query("delete from Movie where id=:id")
    Movie deleteById(Long id);
}
