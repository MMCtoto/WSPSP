package dam;

import java.util.ArrayList;

public class MainCasa {

	public static void main(String[] args) {
		Direccion direccionCasa = new Direccion();
		direccionCasa.setNombreVia("Calle Mares");
		direccionCasa.setTipoVia("avenida adriatico");
		direccionCasa.setCp("28760");
		direccionCasa.setNumero("12");
		
		Persona propietario = new Persona();
		propietario.setNombre("Javier");
		propietario.setDni("62650804A");
		propietario.setEdad(22);
		propietario.setDireccion(direccionCasa);
		
		Habitacion sotano = new Habitacion();
		sotano.setM2(34);
		sotano.setTipoHabitacion("SOTANO");
		
		Habitacion cuarto = new Habitacion();
		cuarto.setM2(25);
		cuarto.setTipoHabitacion("CUARTO");
		
		Habitacion salon = new Habitacion();
		cuarto.setM2(50);
		cuarto.setTipoHabitacion("SALON");
		
		Persona inquilino1 = new Persona();
		inquilino1.setNombre("Antonio");
		inquilino1.setDni("67328623V");
		inquilino1.setEdad(7);
		inquilino1.setDireccion(direccionCasa);
		
		Persona inquilino2 = new Persona();
		inquilino2.setNombre("Maria");
		inquilino2.setDni("67828323V");
		inquilino2.setEdad(19);
		inquilino2.setDireccion(direccionCasa);
		
		Persona inquilino3 = new Persona();
		inquilino2.setNombre("Pineros");
		inquilino2.setDni("73892783V");
		inquilino2.setEdad(25);
		inquilino2.setDireccion(direccionCasa);
		
		Casa casa = new Casa();
		casa.setDireccion(direccionCasa);
		casa.setPrecio(900);
		casa.setPropietario(propietario);
		
		ArrayList<Habitacion> listaHabitaciones = new ArrayList<Habitacion>();
		listaHabitaciones.add(sotano);
		listaHabitaciones.add(salon);
		listaHabitaciones.add(cuarto);
		
		casa.setListaHabitacion(listaHabitaciones);
		
		ArrayList<Persona> listaInquilinos = new ArrayList<Persona>();
		listaInquilinos.add(inquilino1);
		listaInquilinos.add(inquilino2);
		listaInquilinos.add(inquilino3);
		
		casa.setListaInquilinos(listaInquilinos);
		
		//todos estos apuntan al mismo objeto
		inquilino2.getDireccion().setNombreVia("Plaza blanca");
		inquilino1.getDireccion().setNombreVia("Calle fuego");
		
		System.out.println(listaInquilinos.get(0).getDireccion().getNombreVia());
		System.out.println(casa);
	}

}
