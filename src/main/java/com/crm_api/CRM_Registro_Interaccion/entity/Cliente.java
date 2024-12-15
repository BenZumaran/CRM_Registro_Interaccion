package com.crm_api.CRM_Registro_Interaccion.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "num_cliente", nullable = false)
	private int numCliente;
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipo_documento_cliente", nullable = true)
	private Tipo tipoDocumentocliente;
	@Column(name = "documento_cliente", nullable = true, length = 15)
	private String documentoCliente;
	@Column(name = "nombres_cliente", nullable = true, length = 100)
	private String nombresCliente;	
	@Column(name = "fecha_nacimiento_cliente", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date fechaNacimientoCliente;
	@Column(name = "correo_cliente", nullable = true, length = 25)
	private String correoCliente;
	@Column(name = "telefono_cliente", nullable = true, length = 12)
	private String telefonoCliente;
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ruc_empresa", nullable = false)
	private Empresa empresaCliente;

}
