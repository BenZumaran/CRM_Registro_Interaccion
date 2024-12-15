package com.crm_api.CRM_Registro_Interaccion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm_api.CRM_Registro_Interaccion.entity.Interaccion;
import com.crm_api.CRM_Registro_Interaccion.repository.InteraccionRepository;

@Service
public class InteraccionServiceImpl implements InteraccionService {

	@Autowired
	InteraccionRepository repository;
	
	@Override
	public Interaccion insertaActualizaInteraccion(Interaccion interaccion) {
		return repository.save(interaccion);
	}

	@Override
	public List<Interaccion> listaInteraccion() {
		return repository.findAll();
	}

	@Override
	public void eliminaInteraccion(int idInteraccion) {
		repository.deleteById(idInteraccion);
	}

}
