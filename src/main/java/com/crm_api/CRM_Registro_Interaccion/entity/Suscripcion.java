package com.crm_api.CRM_Registro_Interaccion.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="suscripcion")
public class Suscripcion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "num_suscripcion", nullable = false)
	private int numSuscripcion; 
	@Column(name = "nombre_suscripcion", nullable = false, length = 25)
	private String nombreSuscripcion; 
	@Column(name = "descripcion_suscripcion", nullable = false, length = 80)
	private String descripcionSuscripcion; 
	@Column(name = "precio_suscripcion", nullable = false)
	private double precioSuscripcion; 
	@Column(name = "descuentos_suscripcion", nullable = false)
	private double descuentoSuscripcion;

}
