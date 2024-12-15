package com.crm_api.CRM_Registro_Interaccion.service;

import java.util.List;

import com.crm_api.CRM_Registro_Interaccion.entity.Interaccion;

public interface InteraccionService {
	public abstract Interaccion insertaActualizaInteraccion(Interaccion interaccion);
	public abstract List<Interaccion> listaInteraccion();
	public abstract void eliminaInteraccion(int idInteraccion);
}
