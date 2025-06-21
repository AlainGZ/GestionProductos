package com.NRC5414.GestionProductos.repository;

import com.NRC5414.GestionProductos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRespository extends JpaRepository<Producto, Long> {
}
