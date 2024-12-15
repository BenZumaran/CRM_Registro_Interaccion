package com.crm_api.CRM_Registro_Interaccion.service;

import java.util.List;
import java.util.Optional;

import com.crm_api.CRM_Registro_Interaccion.entity.Usuario;

public interface UsuarioService {
	public abstract Usuario insertaActualizaUsuario(Usuario usuario);

	public abstract List<Usuario> listaUsuario();

	public abstract void eliminaUsuario(String idUsuario);

	public abstract Optional<Usuario> buscarUsuarioPorId(String idUsuario);	
	
}
