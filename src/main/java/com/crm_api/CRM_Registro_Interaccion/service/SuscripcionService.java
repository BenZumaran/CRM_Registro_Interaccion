package com.crm_api.CRM_Registro_Interaccion.service;

import java.util.List;

import com.crm_api.CRM_Registro_Interaccion.entity.Suscripcion;


public interface SuscripcionService {
	public abstract Suscripcion insertaActualizaSuscripcion(Suscripcion suscripcion);
	public abstract List<Suscripcion> listaSuscripcion();
	public abstract void eliminaSuscripcion(int idSuscripcion);
}
