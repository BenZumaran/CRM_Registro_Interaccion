package com.crm_api.CRM_Registro_Interaccion.entity;

import java.time.LocalDateTime;

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
@Table(name="licencia")

public class Licencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "num_licencia")
	private int numLicencia;
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ruc_empresa", nullable = false)
	private Empresa rucEmpresa;
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuario idUsuario;
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo", nullable = false)
	private Tipo idTipo;
	@Column(name = "fecha_creacion_licencia", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)	
	private LocalDateTime fechaCreacion;
	@Column(name = "fecha_vencimiento_licencia", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime fechaVencimiento;
	

}
