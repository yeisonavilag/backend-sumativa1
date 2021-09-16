package com.everis.data.models;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity //
@Table(name="ventas")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVenta;
    /*private Usuario usuCompradorVenta;
    private Usuario usuVendedorVenta;
    private ArrayList<Producto> listaProductos;*/
    private Double montototalProductos;
    private String metodoPagoProductos;
    
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;

    public Venta() {
    	super();
    }
    /*
	public Venta(Usuario usuCompradorVenta, Usuario usuVendedorVenta, ArrayList<Producto> listaProductos,
			Double montototalProductos, String metodoPagoProductos) {
		super();
		this.usuCompradorVenta = usuCompradorVenta;
		this.usuVendedorVenta = usuVendedorVenta;
		this.listaProductos = listaProductos;
		this.montototalProductos = montototalProductos;
		this.metodoPagoProductos = metodoPagoProductos;
	}

	public Long getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
	}

	public Usuario getUsuCompradorVenta() {
		return usuCompradorVenta;
	}

	public void setUsuCompradorVenta(Usuario usuCompradorVenta) {
		this.usuCompradorVenta = usuCompradorVenta;
	}

	public Usuario getUsuVendedorVenta() {
		return usuVendedorVenta;
	}

	public void setUsuVendedorVenta(Usuario usuVendedorVenta) {
		this.usuVendedorVenta = usuVendedorVenta;
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public Double getMontototalProductos() {
		return montototalProductos;
	}

	public void setMontototalProductos(Double montototalProductos) {
		this.montototalProductos = montototalProductos;
	}

	public String getMetodoPagoProductos() {
		return metodoPagoProductos;
	}

	public void setMetodoPagoProductos(String metodoPagoProductos) {
		this.metodoPagoProductos = metodoPagoProductos;
	}
    */
    
}
