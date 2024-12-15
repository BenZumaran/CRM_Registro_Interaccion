package com.crm_api.CRM_Registro_Interaccion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm_api.CRM_Registro_Interaccion.entity.Cliente;
import com.crm_api.CRM_Registro_Interaccion.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository repository;
	
	@Override
	public Cliente insertaActualizaCliente(Cliente cliente) {
		return repository.save(cliente);
	}

	@Override
	public List<Cliente> listaCliente() {
		return repository.findAll();
	}

	@Override
	public void eliminaCliente(int idCliente) {
		repository.deleteById(idCliente);
	}
	

}
