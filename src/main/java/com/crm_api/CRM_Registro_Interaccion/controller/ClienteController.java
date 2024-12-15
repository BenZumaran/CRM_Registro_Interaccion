package com.crm_api.CRM_Registro_Interaccion.controller;

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

import com.crm_api.CRM_Registro_Interaccion.entity.Cliente;
import com.crm_api.CRM_Registro_Interaccion.service.ClienteService;

@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteController {
	@Autowired
	private ClienteService servicio;
	
	@GetMapping("/lista")
	public List<Cliente> lista(){
		List<Cliente> lstSalida = servicio.listaCliente();
		return lstSalida;
	}
	
	@CrossOrigin(origins= "http://localhost:5173")
	@PostMapping("/registra")
	@ResponseBody
	public ResponseEntity<?> registra(@RequestBody Cliente cliente){
		HashMap<String, Object> salida = new HashMap<>();
		Cliente objSalida = servicio.insertaActualizaCliente(cliente); 
		if (objSalida == null) {
			salida.put("mensaje", "Error en el registro");
		} else {
			salida.put("mensaje", "Registro de cuenta con el ID >>> " + cliente.getNumCliente()
					+ " >>> Numero de cuenta >> " + cliente.getNombresCliente());
		}		
		return ResponseEntity.ok(salida); 
	}
	
	

}
