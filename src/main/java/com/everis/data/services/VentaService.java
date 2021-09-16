package com.everis.data.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.everis.data.models.Venta;
import com.everis.data.repositories.VentaRepository;

@Service
public class VentaService {
private final VentaRepository vr; 
	
	public VentaService(VentaRepository ventaRepository) {
		this.vr = ventaRepository;
	}
	
	public Venta crearVenta(@Valid Venta venta) {
		//System.out.vrintln("crearVenta: "+venta.getNombre());
		return vr.save(venta); 
	}
	
	public List<Venta> findAll() {
		// retorna una lista de ventas
		return vr.findAll();
		
	}
	
	public void eliminarVenta(Long id) {
		vr.deleteById(id);;
	}

	public Venta buscarVenta(Long id) {
		// TODO Auto-generated method stub
		Optional<Venta> oVenta = vr.findById(id);
		
		if(oVenta.isPresent()) {
			return oVenta.get();
		}
		return null;
	}

	public void modificarVenta(@Valid Venta venta) {
		vr.save(venta);
		
	}
}
