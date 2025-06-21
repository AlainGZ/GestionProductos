package com.NRC5414.GestionProductos;

import com.NRC5414.GestionProductos.model.Producto;
import com.NRC5414.GestionProductos.repository.ProductoRespository;
import com.NRC5414.GestionProductos.service.ProductoService;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import java.util.Collections;

public class ProductoServiceTest {
	@Test
	public void testGuardarProducto() {
		ProductoRespository repo = mock(ProductoRespository.class);
		ProductoService servicio = new ProductoService(repo);

		Producto producto = new Producto();
		producto.setNombre("Teclado");
		producto.setPrecio(45.0);

		servicio.guardar(producto);

		verify(repo, times(1)).save(producto);
	}
}
