package com.crm_api.CRM_Registro_Interaccion.service;

import java.util.List;


import com.crm_api.CRM_Registro_Interaccion.entity.Empresa;

public interface EmpresaService {
	public abstract Empresa insertaActualizaEmpresa(Empresa empresa);
	public abstract List<Empresa> listaEmpresa();
	public abstract void eliminaEmpresa(String idEmpresa);
	public abstract void ingresoUsuarioEmpresa(String idEmpresa, String idUsuario);
}
