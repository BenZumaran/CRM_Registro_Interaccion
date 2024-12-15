package com.crm_api.CRM_Registro_Interaccion.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crm_api.CRM_Registro_Interaccion.entity.Suscripcion;
import com.crm_api.CRM_Registro_Interaccion.service.SuscripcionService;

@RestController
@RequestMapping("/api/v1/suscripcion")
public class SuscripcionController {
	@Autowired
	SuscripcionService servicio;
	
	@GetMapping("/lista")
	public List<Suscripcion> lista(){
		return servicio.listaSuscripcion();
	}
	
	@PostMapping("/registra")
	@ResponseBody
	public ResponseEntity<?> registra(@RequestBody Suscripcion suscripcion){
		HashMap<String, Object> salida = new HashMap<>();
		Suscripcion objSalida = servicio.insertaActualizaSuscripcion(suscripcion);
		if (objSalida == null) {
			salida.put("mensaje", "Error en el registro");
		} else {
			salida.put("mensaje", "Registro de cuenta con el Número >>> " + suscripcion.getNumSuscripcion()
					+ " >>> Nombre de suscripcion >> " + suscripcion.getNombreSuscripcion());
		}		
		return ResponseEntity.ok(salida);
	}
}
