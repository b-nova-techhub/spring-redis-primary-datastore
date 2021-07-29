package com.example.springredisprimarydatastore.dao;

import com.example.springredisprimarydatastore.model.MovieModel;
import org.springframework.data.repository.CrudRepository;

public interface MovieDao extends CrudRepository<MovieModel, String> {
}
