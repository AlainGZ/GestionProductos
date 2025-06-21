package com.NRC5414.GestionProductos.controller;

import org.springframework.ui.Model;
import com.NRC5414.GestionProductos.model.Producto;
import com.NRC5414.GestionProductos.service.ProductoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	private final ProductoService servicio;

	public ProductoController(ProductoService servicio) {
		this.servicio = servicio;
	}

	@GetMapping
	public String listar(Model model) {
		model.addAttribute("productos", servicio.listar());
		return "productos";
	}

	@GetMapping("/nuevo")
	public String formulario(Model model) {
		model.addAttribute("producto", new Producto());
		return "formulario";
	}

	@PostMapping("/guardar")
	public String guardar(@ModelAttribute Producto producto) {
		servicio.guardar(producto);
		return "redirect:/productos";
	}

	@GetMapping("/editar/{id}")
	public String editar(@PathVariable Long id, Model model) {
		model.addAttribute("producto", servicio.obtener(id));
		return "formulario";
	}

	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable Long id) {
		servicio.eliminar(id);
		return "redirect:/productos";
	}
}
