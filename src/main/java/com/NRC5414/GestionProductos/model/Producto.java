package com.NRC5414.GestionProductos.model;

import jakarta.persistence.*;

@Entity
@Table(name="producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;

	private double precio;

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }

	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	public double getPrecio() { return precio; }
	public void setPrecio(double precio) { this.precio = precio; }

}
