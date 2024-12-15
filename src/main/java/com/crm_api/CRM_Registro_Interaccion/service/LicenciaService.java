package com.crm_api.CRM_Registro_Interaccion.service;

import java.util.List;

import com.crm_api.CRM_Registro_Interaccion.entity.Licencia;



public interface LicenciaService {
	public abstract Licencia insertaActualizaLicencia(Licencia licencia);
	public abstract List<Licencia> listaLicencia();
	public abstract void eliminaLicencia(int idLicencia);
}
