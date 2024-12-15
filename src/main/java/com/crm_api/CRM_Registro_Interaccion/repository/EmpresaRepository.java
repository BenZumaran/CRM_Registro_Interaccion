package com.crm_api.CRM_Registro_Interaccion.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.crm_api.CRM_Registro_Interaccion.entity.Empresa;



public interface EmpresaRepository extends JpaRepository<Empresa, String>{
	
	@Modifying
	@Query(value="insert into empresa_usuario (ruc_empresa, id_usuario) values (:idEmpresa, :idUsuario)", nativeQuery = true)
	@Transactional
	public void agregarUsuarioEmpresa(@Param("idEmpresa") String idEmpresa, @Param("idUsuario") String idUsuario);
	
	
}
