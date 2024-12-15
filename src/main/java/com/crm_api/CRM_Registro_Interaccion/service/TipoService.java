package com.crm_api.CRM_Registro_Interaccion.service;

import java.util.List;

import com.crm_api.CRM_Registro_Interaccion.entity.Tipo;

public interface TipoService {

	public abstract Tipo insertaActualizaTipo(Tipo tipo);
	public abstract List<Tipo> listaTipo();
	public abstract List<Tipo> listaTipoPorGrupo(String grupo);
	public abstract void eliminaTipo(String idTipo);
	
	
}
