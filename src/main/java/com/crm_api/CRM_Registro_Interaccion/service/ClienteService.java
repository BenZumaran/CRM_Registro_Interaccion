package com.crm_api.CRM_Registro_Interaccion.service;

import java.util.List;

import com.crm_api.CRM_Registro_Interaccion.entity.Cliente;

public interface ClienteService {
	public abstract Cliente insertaActualizaCliente(Cliente cliente);
	public abstract List<Cliente> listaCliente();
	public abstract void eliminaCliente(int idCliente);
}
