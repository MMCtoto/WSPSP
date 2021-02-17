package dam;

import java.util.ArrayList;

public class Casa {
	private double precio;
	private Persona propietario;
	private Direccion direccion;
	private ArrayList<Habitacion> listaHabitacion;
	private ArrayList<Persona> listaInquilino;
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Persona getPropietario() {
		return propietario;
	}
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Habitacion> getListaHabitacion() {
		return listaHabitacion;
	}
	public void setListaHabitacion(ArrayList<Habitacion> listaHabitacion) {
		this.listaHabitacion = listaHabitacion;
	}
	public ArrayList<Persona> getListaInquilino() {
		return listaInquilino;
	}
	public void setListaInquilinos(ArrayList<Persona> listaInquilino) {
		this.listaInquilino = listaInquilino;
	}
	@Override
	public String toString() {
		return "Casa [precio=" + precio + "\n propietario=" + propietario + "\n direccion=" + direccion
				+ "\n listaHabitaciones=" + listaHabitacion + "\n listaInquilinos=" + listaInquilino + "]";
	}
	
	public double calcularM2() {
		int m2totales = 0;
		for(Habitacion h : listaHabitacion) {
			m2totales += h.getM2();
		}
		return m2totales;
	}

}
