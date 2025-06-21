package com.NRC5414.GestionProductos.service;

import com.NRC5414.GestionProductos.model.Producto;
import com.NRC5414.GestionProductos.repository.ProductoRespository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

	private final ProductoRespository repo;

	public ProductoService(ProductoRespository  repo) {
		this.repo = repo;
	}

	public List<Producto> listar() {
		return repo.findAll();
	}

	public void guardar(Producto producto) {
		repo.save(producto);
	}

	public Producto obtener(Long id) {
		return repo.findById(id).orElse(null);
	}

	public void eliminar(Long id) {
		repo.deleteById(id);
	}
}
