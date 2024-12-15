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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crm_api.CRM_Registro_Interaccion.entity.Empresa;
import com.crm_api.CRM_Registro_Interaccion.service.EmpresaService;

@RestController
@RequestMapping("/api/v1/empresa")
public class EmpresaController {
	@Autowired
	private EmpresaService servicio;
	
	@CrossOrigin(origins= "http://localhost:5173")
	@GetMapping("/lista")
	public List<Empresa> lista(){
		List<Empresa> lstSalida = servicio.listaEmpresa();
		return lstSalida;
	}
	
	@CrossOrigin(origins= "http://localhost:5173")
	@PostMapping("/registra")
	@ResponseBody
	public ResponseEntity<?> registra(@RequestBody Empresa empresa){
		HashMap<String, Object> salida = new HashMap<>();
		Empresa objSalida = servicio.insertaActualizaEmpresa(empresa); 
		if (objSalida == null) {
			salida.put("mensaje", "Error en el registro");
		} else {
			salida.put("mensaje", "Registro de cuenta con el ID >>> " + empresa.getRucEmpresa()
					+ " >>> Numero de cuenta >> " + empresa.getRazonSocialEmpresa());
		}		
		return ResponseEntity.ok(salida); 
	}
	
	@PostMapping("/agregarUsuarioEmpresa")
	@ResponseBody
	public void agregarUsuarioEmpresa(@RequestParam String idEmpresa, @RequestParam String idUsuario) {
		servicio.ingresoUsuarioEmpresa(idEmpresa, idUsuario);
	}
	
}
