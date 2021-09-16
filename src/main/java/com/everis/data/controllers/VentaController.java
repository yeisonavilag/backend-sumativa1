package com.everis.data.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.everis.data.models.Venta;
import com.everis.data.services.VentaService;

@Controller
@RequestMapping("/venta")
public class VentaController {
	private final VentaService vs;
	
	public VentaController(VentaService ventaService) {
		this.vs=ventaService;
	}
	
	@RequestMapping("")
	public String index(@ModelAttribute("persona") Venta venta, Model model) {
		System.out.println("index");
		List<Venta> lista_ventas =  vs.findAll();
		model.addAttribute("lista_ventas", lista_ventas);
		//System.out.println("ventas: "+lista_personas.get(0).getNombre());
		System.out.println("listas");
		return "venta.jsp";
	}
	
}
