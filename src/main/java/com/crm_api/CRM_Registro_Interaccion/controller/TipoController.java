package com.crm_api.CRM_Registro_Interaccion.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crm_api.CRM_Registro_Interaccion.entity.Tipo;
import com.crm_api.CRM_Registro_Interaccion.service.TipoService;

@RestController
@RequestMapping("/api/v1/tipo")
public class TipoController {
	@Autowired
	private TipoService servicio;
	

	@GetMapping("/lista")
	public List<Tipo> lista() {
		List<Tipo> lstSalida = servicio.listaTipo();
		return lstSalida;
	}
	
	@GetMapping("/listaPorGrupo")
	@ResponseBody
	public List<Tipo> listaPorGrupo(@RequestParam String grupo) {
		List<Tipo> lstSalida = servicio.listaTipoPorGrupo(grupo+"%");
		return lstSalida;
	}
	
	@PostMapping("/registro")
	@ResponseBody
	public ResponseEntity<?> registra(@RequestBody Tipo tipo){
		HashMap<String, Object> salida = new HashMap<>();	
			Tipo objSalida = servicio.insertaActualizaTipo(tipo); 
			if (objSalida == null) {
				salida.put("mensaje", "Error en el registro");
			} else {
				salida.put("mensaje", "Registro de cuenta con el ID >>> " + tipo.getIdTipo()
						+ " >>> Numero de cuenta >> " + tipo.getDescripcionTipo() );
			}		
		return ResponseEntity.ok(salida);
	}	

}
