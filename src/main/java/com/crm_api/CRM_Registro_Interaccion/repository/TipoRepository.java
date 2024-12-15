package com.crm_api.CRM_Registro_Interaccion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.crm_api.CRM_Registro_Interaccion.entity.Tipo;

public interface TipoRepository extends JpaRepository<Tipo, String> {
	
	@Query("Select t from Tipo t where t.idTipo like ?1")
	public List<Tipo> listaTipoPorGrupo(String grupo);
	
}
