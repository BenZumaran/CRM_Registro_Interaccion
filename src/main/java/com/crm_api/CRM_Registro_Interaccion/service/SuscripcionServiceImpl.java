package com.crm_api.CRM_Registro_Interaccion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm_api.CRM_Registro_Interaccion.entity.Suscripcion;
import com.crm_api.CRM_Registro_Interaccion.repository.SuscripcionRepository;

@Service
public class SuscripcionServiceImpl implements SuscripcionService {

	@Autowired
	SuscripcionRepository repository;
	
	@Override
	public Suscripcion insertaActualizaSuscripcion(Suscripcion suscripcion) {
		return repository.save(suscripcion);
	}

	@Override
	public List<Suscripcion> listaSuscripcion() {
		return repository.findAll();
	}

	@Override
	public void eliminaSuscripcion(int idSuscripcion) {
		repository.deleteById(idSuscripcion);
	}

}
