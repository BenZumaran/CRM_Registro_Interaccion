package com.crm_api.CRM_Registro_Interaccion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm_api.CRM_Registro_Interaccion.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
