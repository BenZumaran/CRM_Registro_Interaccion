package com.crm_api.CRM_Registro_Interaccion.controller;

import java.time.LocalDateTime;
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

import com.crm_api.CRM_Registro_Interaccion.entity.Interaccion;
import com.crm_api.CRM_Registro_Interaccion.service.InteraccionService;

@RestController
@RequestMapping("/api/v1/interaccion")
public class InteraccionController {
	
	@Autowired
	InteraccionService servicio;
	
	@GetMapping("/lista")
	public List<Interaccion> lista() {
		return servicio.listaInteraccion();
	}
	
	@PostMapping("/registra")
	@ResponseBody
	public ResponseEntity<?> registra(@RequestBody Interaccion interaccion){
		HashMap<String, Object> salida = new HashMap<>();
		interaccion.setFechaInteraccion(LocalDateTime.now());
		Interaccion objSalida = servicio.insertaActualizaInteraccion(interaccion);
		if (objSalida == null) {
			salida.put("mensaje", "Error en el registro");
		} else {
			salida.put("mensaje", "Registro de interacción con el Número >>> " + interaccion.getNumeroInteraccion()
					+ " >>> Detalle Interacción >> " + interaccion.getDetalleInteraccion());
		}		
		return ResponseEntity.ok(salida);
	}
	

}
