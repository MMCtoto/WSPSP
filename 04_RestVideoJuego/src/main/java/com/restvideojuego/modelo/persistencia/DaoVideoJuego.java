package com.restvideojuego.modelo.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.restvideojuego.modelo.entidad.VideoJuego;



@Component
public class DaoVideoJuego {
	private List<VideoJuego> listaJuegos;
	private int contador = 0;
	
	
	public DaoVideoJuego() {

		VideoJuego juego = new VideoJuego();
		juego.setId(10);
		juego.setCompania("Sega");
		juego.setNombre("NapoleonTotalWar");
		juego.setPrecio(34.69);
		juego.setPuntuacion(8.7);
		
		listaJuegos = new ArrayList<VideoJuego>();
		listaJuegos.add(juego);		
		}
		
	
	public List<VideoJuego> listado(){
		return listaJuegos;
	}
	

	
	public VideoJuego buscar(int id) {
		VideoJuego persona = null;
		for(VideoJuego p : listaJuegos) {
			if(p.getId() == id) {
				persona = p;
				break;
			}
		}
		
		return persona;
	}
	
	public VideoJuego alta(VideoJuego p) {
		p.setId(contador++);
		listaJuegos.add(p);
		return p;
	}
	
	public VideoJuego modificar(VideoJuego pModificar) {
		VideoJuego p = buscar(pModificar.getId());
		if(p != null) {
			p.setNombre(pModificar.getNombre());
			p.setPrecio(pModificar.getPrecio());
		}		
		return p;
	}
	
	public VideoJuego borrar(int id) {
		VideoJuego p = buscar(id);
		if(p != null) {
			listaJuegos.remove(id);
		}
		return p;
	}
}
