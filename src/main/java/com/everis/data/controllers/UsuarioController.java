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
import com.everis.data.models.Usuario;
import com.everis.data.services.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	private final UsuarioService us; 
	
	public UsuarioController(UsuarioService usuarioService) {
		this.us = usuarioService;
	}
	
	@RequestMapping("")
	public String index(@ModelAttribute("usuario") Usuario usuario, Model model) {
		System.out.println("index");
		List<Usuario> lista_usuarios =  us.findAll();
		model.addAttribute("lista_usuarios", lista_usuarios);
		System.out.println("listas");
		return "usuario.jsp";
	}
	
	@RequestMapping(value="/crear", method=RequestMethod.POST)
	public String crear(@Valid @ModelAttribute("usuario") Usuario usuario, Model model) {
		us.crearUsuario(usuario);
		return "redirect:/usuario";
	}
	
	//METODO ACTUALIZAR
	@RequestMapping(value="/actualizar/{id}", method=RequestMethod.GET)
	public String actualizar(@PathVariable("id") Long id, Model model){
		System.out.println("Actualizar id: "+id);
		Usuario usuario = us.buscarUsuario(id);
		model.addAttribute("usuario", usuario);
		return "editar-usuario.jsp";
		
	}
	
	@RequestMapping(value="/modificar", method=RequestMethod.PUT)
	public String modificar(@Valid @ModelAttribute("usuario") Usuario usuario) {
		us.modificarUsuario(usuario);
		return "redirect:/usuario";
	}
	
	//ELIMINAR
	@RequestMapping(value="/eliminar", method=RequestMethod.POST)
	public String eliminar(@RequestParam("id") Long id) {
		System.out.println("Eliminar id: "+id);
		us.eliminarUsuario(id);
		return "redirect:/usuario";
	}
	
}
