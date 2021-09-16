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
@Table(name="usuarios")
public class Usuario {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	private Integer rutUsuario;
	private String dvUsuario; //digito verificador
    private String nombreUsuario;
    private String apellidoUsuario;
    private String correoUsuario;
    private String tipoUsuario;

    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    public Usuario() {
    	super();
    }

	public Usuario(Integer rut, String dv, String nombre, String apellido, String correo, String tipousuario) {
		super();
		this.rutUsuario = rut;
		this.dvUsuario = dv;
		this.nombreUsuario = nombre;
		this.apellidoUsuario = apellido;
		this.correoUsuario = correo;
		this.tipoUsuario = tipousuario;
	}

    public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getRutUsuario() {
		return rutUsuario;
	}

	public void setRutUsuario(Integer rutUsuario) {
		this.rutUsuario = rutUsuario;
	}

	public String getDvUsuario() {
		return dvUsuario;
	}

	public void setDvUsuario(String dvUsuario) {
		this.dvUsuario = dvUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidoUsuario() {
		return apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	public String getCorreoUsuario() {
		return correoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
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
