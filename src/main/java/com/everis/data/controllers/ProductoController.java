package com.everis.data.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.data.models.Producto;
import com.everis.data.services.ProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController {
	private final ProductoService ps;
	
	public ProductoController(ProductoService productoService) {
		this.ps=productoService;
	}
	
	@RequestMapping("")
	public String index(@ModelAttribute("producto") Producto producto, Model model) {
		System.out.println("index");
		List<Producto> lista_productos =  ps.findAll();
		model.addAttribute("lista_productos", lista_productos);
		System.out.println("listas");
		return "producto.jsp";
	}
	
	@RequestMapping(value="/crear", method=RequestMethod.POST)
	public String crear(@Valid @ModelAttribute("producto") Producto producto, Model model) {
		ps.crearProducto(producto);
		return "redirect:/producto";
	}
	
	//METODO ACTUALIZAR
	@RequestMapping(value="/actualizar/{id}", method=RequestMethod.GET)
	public String actualizar(@PathVariable("id") Long id, Model model){
		System.out.println("Actualizar id: "+id);
		Producto producto = ps.buscarProducto(id);
		model.addAttribute("producto", producto);
		return "editar-producto.jsp";
		
	}
	
	@RequestMapping(value="/modificar", method=RequestMethod.PUT)
	public String modificar(@Valid @ModelAttribute("producto") Producto producto) {
		ps.modificarProducto(producto);
		return "redirect:/producto";
	}
	
	//ELIMINAR
	@RequestMapping(value="/eliminar", method=RequestMethod.POST)
	public String eliminar(@RequestParam("id") Long id) {
		System.out.println("Eliminar id: "+id);
		ps.eliminarProducto(id);
		return "redirect:/producto";
	}
}
