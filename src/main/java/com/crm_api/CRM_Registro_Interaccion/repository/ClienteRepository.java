package com.crm_api.CRM_Registro_Interaccion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm_api.CRM_Registro_Interaccion.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	

}
