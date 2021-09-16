package com.everis.data.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.everis.data.models.Producto;
import com.everis.data.repositories.ProductoRepository;

@Service
public class ProductoService {
	private final ProductoRepository pr;

	public ProductoService(ProductoRepository productoRepository) {
		this.pr = productoRepository;
	}
	
	public Producto crearProducto(@Valid Producto producto) {
		//System.out.println("crearProducto: "+producto.getNombre());
		return pr.save(producto); 
	}
	
	public List<Producto> findAll() {
		// retorna una lista de productos
		return pr.findAll();
	}
	
	public void eliminarProducto(Long id) {
		pr.deleteById(id);;
	}

	public Producto buscarProducto(Long id) {
		// TODO Auto-generated method stub
		Optional<Producto> oProducto = pr.findById(id);
		
		if(oProducto.isPresent()) {
			return oProducto.get();
		}
		return null;
	}

	public void modificarProducto(@Valid Producto producto) {
		pr.save(producto);
		
	}
}
