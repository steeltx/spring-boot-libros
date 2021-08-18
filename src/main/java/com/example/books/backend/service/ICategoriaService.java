package com.example.books.backend.service;

import org.springframework.http.ResponseEntity;

import com.example.books.backend.response.CategoriaResponseRest;

public interface ICategoriaService {
	
	public ResponseEntity<CategoriaResponseRest> buscarCategorias();

}
