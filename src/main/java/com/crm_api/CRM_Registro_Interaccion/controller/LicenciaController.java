package com.crm_api.CRM_Registro_Interaccion.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crm_api.CRM_Registro_Interaccion.entity.Licencia;
import com.crm_api.CRM_Registro_Interaccion.service.LicenciaService;

@RestController
@RequestMapping("/api/v1/licencia")
public class LicenciaController {
	@Autowired
	LicenciaService servicio;
	@GetMapping("/lista")
	public List<Licencia> lista(){
		return servicio.listaLicencia();
	}
	@CrossOrigin(origins= "http://localhost:5173")
	@PostMapping("/registra")
	@ResponseBody
	public ResponseEntity<?> registra(@RequestBody Licencia licencia){
		HashMap<String, Object> salida = new HashMap<>();
		licencia.setFechaCreacion(LocalDateTime.now());
		licencia.setFechaVencimiento(LocalDateTime.now().plusMonths(6));
		Licencia objSalida = servicio.insertaActualizaLicencia(licencia);
		if (objSalida == null) {
			salida.put("mensaje", "Error en el registro");
		} else {
			salida.put("mensaje", "Registro de Licencia con el Número >>> " + licencia.getNumLicencia()
					+ " >>> Tipo Licencia >> " + licencia.getIdTipo());
		}	
		return ResponseEntity.ok(salida);
	}
}
