package com.example.books.backend.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.books.backend.model.Categoria;

public interface ICategoriaDao extends CrudRepository<Categoria, Long>{

}
