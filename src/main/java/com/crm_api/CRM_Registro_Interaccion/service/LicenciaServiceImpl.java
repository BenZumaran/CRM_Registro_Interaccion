package com.crm_api.CRM_Registro_Interaccion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm_api.CRM_Registro_Interaccion.entity.Licencia;
import com.crm_api.CRM_Registro_Interaccion.repository.LicenciaRepository;

@Service
public class LicenciaServiceImpl implements LicenciaService {

	@Autowired
	LicenciaRepository repository;
	
	@Override
	public Licencia insertaActualizaLicencia(Licencia licencia) {
		return repository.save(licencia);
	}

	@Override
	public List<Licencia> listaLicencia() {
		return repository.findAll();
	}

	@Override
	public void eliminaLicencia(int idLicencia) {
		repository.deleteById(idLicencia);
	}

}
