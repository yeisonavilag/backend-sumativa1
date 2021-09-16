package com.everis.data;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.everis.data.models.Producto;
import com.everis.data.models.Usuario;

@SpringBootApplication
public class BackendSumativa1Application {

	public static void main(String[] args) {

		ArrayList<Usuario> listaUsuarios=new ArrayList<Usuario>();
		ArrayList<Producto> listaProductos=new ArrayList<Producto>();
		
		Usuario usuario1 = new Usuario(18687228,"2","Yeison","Avila","yeison@gmail.com","Vendedor");
		Usuario usuario2 = new Usuario(9430795,"3","Edith","Gonzalez","edith@gmail.com","Comprador");
		Usuario usuario3 = new Usuario(8292515,"5","Segundo","Avila","segundo@gmail.com","Comprador");
		
		listaUsuarios.add(usuario1);
		listaUsuarios.add(usuario2);
		listaUsuarios.add(usuario3);
		
		Producto producto1 = new Producto("Caja1","Cajita1",100);
		Producto producto2 = new Producto("Caja2","cajita2",200);
		Producto producto3 = new Producto("Caja3","Cajita3",300);
		
		listaProductos.add(producto1);
		listaProductos.add(producto2);
		listaProductos.add(producto3);
		
		
		SpringApplication.run(BackendSumativa1Application.class, args);
		
	}


}
