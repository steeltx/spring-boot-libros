package com.example.books.backend.service;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.books.backend.model.Categoria;
import com.example.books.backend.model.dao.ICategoriaDao;
import com.example.books.backend.response.CategoriaResponseRest;

@Service
public class CategoriaServiceImpl implements ICategoriaService {

	private static final Logger log = LoggerFactory.getLogger(CategoriaServiceImpl.class);

	@Autowired
	private ICategoriaDao categoriaDao;

	@Override
	@Transactional(readOnly = true)
	public CategoriaResponseRest buscarCategorias() {
		log.info("Inicio de metodo buscarCategorias()");
		CategoriaResponseRest response = new CategoriaResponseRest();

		try {
			List<Categoria> categoria = (List<Categoria>) categoriaDao.findAll();

			response.getCategoriaResponse().setCategoria(categoria);

			response.setMetadata("Respuesta ok", "200", "Respuesta exitosa");

		} catch (Exception e) {
			response.setMetadata("Respuesta no ok", "500", "Respuesta incorrecta");
			log.error("Error al consultar categorias : " + e.getMessage());
			e.getStackTrace();
		}
		return response;
	}

}
