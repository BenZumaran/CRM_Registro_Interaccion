package com.crm_api.CRM_Registro_Interaccion.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="empresa")
public class Empresa {
	@Id	
	@Column(name = "ruc_empresa", nullable = false, length = 11)
	private String rucEmpresa; 
	@Column(name = "razon_social_empresa", nullable = false, length = 25, unique = true)
	private String razonSocialEmpresa; 
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "num_suscripcion")
	private Suscripcion suscripcionEmpresa ;
	@Column(name = "estado_empresa", nullable = false)
	private boolean estadoEmpresa;
	@Column(name = "catidad_licencias_empresa", nullable = false)	
	private int cantidadLicenciasEmpresa;
	
	@ManyToMany(fetch = FetchType.LAZY ,cascade = {CascadeType.ALL})
	@JoinTable(
			name = "empresa_usuario",
			joinColumns = @JoinColumn(name="ruc_empresa", table = "empresa"),
			inverseJoinColumns = @JoinColumn(name="id_usuario", table = "usuario")	
			)	
	private List<Usuario> usuarios;
	
}
