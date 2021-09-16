package com.everis.data.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity //
@Table(name="productos")
public class Producto {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long idProducto;
	 private String nombreProducto;
	 private String descripcionProducto;
	 private double valorProducto;
	 
	 @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    public Producto() {
    	super();
    }

	public Producto(String nombreProducto, String descripcionProducto, double valorProducto) {
		super();
		this.nombreProducto = nombreProducto;
		this.descripcionProducto = descripcionProducto;
		this.valorProducto = valorProducto;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	public double getValorProducto() {
		return valorProducto;
	}

	public void setValorProducto(double valorProducto) {
		this.valorProducto = valorProducto;
	}
    
	@PrePersist
    protected void onCreate(){
    	this.createdAt = new Date();
    }
    //antes de que el objeto sea actualizado
    @PreUpdate
    protected void onUpdate(){
    	this.updatedAt = new Date();
    }
    
}


