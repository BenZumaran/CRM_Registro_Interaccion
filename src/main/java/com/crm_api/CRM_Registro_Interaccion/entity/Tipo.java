package com.crm_api.CRM_Registro_Interaccion.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="tipo")
public class Tipo {
	@Id
	@Column(name="id_tipo", nullable = false)
	private String idTipo;
	@Column(name="descripcion_tipo", nullable = false, length = 25)
	private String descripcionTipo;
}
