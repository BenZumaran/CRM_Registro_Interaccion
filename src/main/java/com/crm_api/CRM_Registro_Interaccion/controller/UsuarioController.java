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

import com.crm_api.CRM_Registro_Interaccion.entity.Usuario;
import com.crm_api.CRM_Registro_Interaccion.service.UsuarioService;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioService servicio;
	
	@GetMapping("/lista")
	public List<Usuario> lista(){
		return servicio.listaUsuario();
	}
	@CrossOrigin(origins= "http://localhost:5173")
	@PostMapping("/registra")
	@ResponseBody
	public ResponseEntity<?> registra(@RequestBody Usuario usuario){
		HashMap<String, Object> salida = new HashMap<>();
		Usuario objSalida = servicio.insertaActualizaUsuario(usuario);
		if (objSalida == null) {
			salida.put("mensaje", "Error en el registro");
		} else {
			salida.put("mensaje", "Registro de usuario con el ID >>> " + usuario.getIdUsuario()
					+ " >>> Nombre Usuario >> " + usuario.getNombreUsuario());
		}	
		return ResponseEntity.ok(salida);
	}

}
