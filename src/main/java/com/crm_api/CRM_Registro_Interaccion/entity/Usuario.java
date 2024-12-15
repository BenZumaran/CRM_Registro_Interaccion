package com.crm_api.CRM_Registro_Interaccion.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	@Column(name = "id_usuario", length = 6)
	private String idUsuario;
	@Column(name="nombres_usuario", nullable = false, length = 80)
	private String nombreUsuario;
	@Column(name="correo_usuario", nullable = false, unique = true, length = 50)
	private String correoUsuario;
	@Column(name="clave_usuario", nullable = false, length = 20)
	private String claveUsuario;
	@Column(name="telefono_usuario", nullable = false, length = 11)
	private String telefonoUsuario;
	@Column(name="salt_usuario", nullable = false)
	private String saltUsuario;	
	@Column(name="fecha_nacimiento_usuario", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechaNacimientoUsuario;
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo")
	private Tipo tipoUsuario;	
	@Column(name="estado_usuario", nullable = false)
	private boolean estadoUsuario;
	

}
