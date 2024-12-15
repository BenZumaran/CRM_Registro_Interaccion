package com.crm_api.CRM_Registro_Interaccion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm_api.CRM_Registro_Interaccion.entity.Tipo;
import com.crm_api.CRM_Registro_Interaccion.repository.TipoRepository;

@Service
public class TipoServiceImpl implements TipoService {

	@Autowired
	TipoRepository repository;
	
	@Override
	public Tipo insertaActualizaTipo(Tipo tipo) {
		return repository.save(tipo);
	}

	@Override
	public List<Tipo> listaTipo() {
		return repository.findAll();
	}

	@Override
	public List<Tipo> listaTipoPorGrupo(String grupo) {
		return repository.listaTipoPorGrupo(grupo);
	}

	@Override
	public void eliminaTipo(String idTipo) {
		repository.deleteById(idTipo);
	}
	
	
	
}
