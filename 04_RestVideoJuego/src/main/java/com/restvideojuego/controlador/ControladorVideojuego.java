package com.restvideojuego.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restvideojuego.modelo.entidad.VideoJuego;
import com.restvideojuego.modelo.persistencia.DaoVideoJuego;

@RestController
public class ControladorVideojuego {
	@Autowired
	private DaoVideoJuego daoVideoJuego;
	
	@GetMapping("VideoJuego")
	public ResponseEntity<List<VideoJuego>> listar(){
		List<VideoJuego> lista = daoVideoJuego.listado();
		
		//Con un objeto de tipo ResponseEntity podemos devolver datos
		//y ademas codigos de respuesta
		ResponseEntity<List<VideoJuego>> re = 
				new ResponseEntity<List<VideoJuego>>(lista, HttpStatus.OK);
		
		return re;
	}
	

	@GetMapping("VideoJuego/{id}")
	public ResponseEntity<VideoJuego> obtener(@PathVariable("id") int id_persona){
		System.out.println("El id a buscar es: " + id_persona);
		
		VideoJuego v1 = daoVideoJuego.buscar(id_persona);
		HttpStatus hs = null;
		if(v1 != null) {
			hs = HttpStatus.OK;
		}else {
			hs = HttpStatus.NOT_FOUND;
		}
		
		ResponseEntity<VideoJuego> re = new ResponseEntity<VideoJuego>(v1,hs);
		
		return re;
	}
	
	//Con la anotacion @RequestBodoy Spring va a intentar coger la informacion
	//que me ponga el cliente en el body del http y convertirlo a un objeto
	//de tipo personas
	@PostMapping("VideoJuego")
	public ResponseEntity<VideoJuego> alta(@RequestBody VideoJuego v) {
		VideoJuego vAlta = daoVideoJuego.alta(v);
		
		ResponseEntity<VideoJuego> re = 
				new ResponseEntity<VideoJuego>(vAlta,HttpStatus.CREATED);
		return re;
	}
	
	//Para modificar usaremos el verbo PUT
	//recurso que vamos a mapear
	@PutMapping("VideoJuego/{id}")
	public ResponseEntity<VideoJuego> modificar(@RequestBody VideoJuego v,
			@PathVariable("id") int id_juego){
		//Aqui me va venir el id por el parametro de URL y el resto
		//de la informacion a cambiar por el body
		//Asi pues le meto el id a la persona que me llega para juntarlos
		v.setId(id_juego);
		
		VideoJuego vModificada = daoVideoJuego.modificar(v);
		
		HttpStatus hs = null;
		if(vModificada != null) {
			hs = HttpStatus.OK;
		}else {
			hs = HttpStatus.NOT_FOUND;
		}
		
		ResponseEntity<VideoJuego> re = 
				new ResponseEntity<VideoJuego>(vModificada,hs);
		
		return re;
	}
	//Para borrar usaremos el metodoo DELETE
	@DeleteMapping("VideoJuego/{id}")
	public ResponseEntity<VideoJuego> borrar(@PathVariable("id") int id_persona){
		VideoJuego v = daoVideoJuego.borrar(id_persona);
		HttpStatus hs = null;
		if(v != null) {
			hs = HttpStatus.OK;
		}else {
			hs = HttpStatus.NOT_FOUND;
		}
		
		ResponseEntity<VideoJuego> re = 
				new ResponseEntity<VideoJuego>(v,hs);
		
		return re;
	}

	
}



