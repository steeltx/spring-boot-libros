package com.example.books.backend.response;

import java.util.List;

import com.example.books.backend.model.Categoria;

public class CategoriaResponse {

	private List<Categoria> categoria;

	public List<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}

}
