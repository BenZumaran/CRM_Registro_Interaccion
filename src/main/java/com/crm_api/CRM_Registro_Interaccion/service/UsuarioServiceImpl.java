package com.crm_api.CRM_Registro_Interaccion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm_api.CRM_Registro_Interaccion.entity.Usuario;
import com.crm_api.CRM_Registro_Interaccion.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioRepository repository;

	@Override
	public Usuario insertaActualizaUsuario(Usuario usuario) {
		return repository.save(usuario);
	}

	@Override
	public List<Usuario> listaUsuario() {
		return repository.findAll();
	}

	@Override
	public void eliminaUsuario(String idUsuario) {
		repository.deleteById(idUsuario);
	}

	@Override
	public Optional<Usuario> buscarUsuarioPorId(String idUsuario) {
		return repository.findById(idUsuario);
	}

}
