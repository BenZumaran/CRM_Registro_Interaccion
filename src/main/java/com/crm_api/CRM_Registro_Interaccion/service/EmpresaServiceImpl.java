package com.crm_api.CRM_Registro_Interaccion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm_api.CRM_Registro_Interaccion.entity.Empresa;
import com.crm_api.CRM_Registro_Interaccion.repository.EmpresaRepository;

@Service
public class EmpresaServiceImpl implements EmpresaService{

	@Autowired
	EmpresaRepository repository;
	
	@Override
	public Empresa insertaActualizaEmpresa(Empresa empresa) {
		return repository.save(empresa);
	}

	@Override
	public List<Empresa> listaEmpresa() {
		return repository.findAll();
	}

	@Override
	public void eliminaEmpresa(String idEmpresa) {
		repository.deleteById(idEmpresa);
	}

	@Override
	public void ingresoUsuarioEmpresa(String idEmpresa, String idUsuario) {
		repository.agregarUsuarioEmpresa(idEmpresa, idUsuario);
	}

}
