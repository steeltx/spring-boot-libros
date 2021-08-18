package com.example.books.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.books.backend.response.CategoriaResponseRest;
import com.example.books.backend.service.ICategoriaService;

@RestController
@RequestMapping("/v1")
public class CategoriaRestController {

	@Autowired
	private ICategoriaService service;

	@GetMapping("/categorias")
	public CategoriaResponseRest consultaCat() {
		CategoriaResponseRest response = service.buscarCategorias();
		return response;
	}

}
