package dam;

public class Habitacion {
	private double m2;
	private String tipoHabitacion;
	
	public double getM2() {
		return m2;
	}
	public void setM2(double m2) {
		this.m2 = m2;
	}
	public String getTipoHabitacion() {
		return tipoHabitacion;
	}
	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
	@Override
	public String toString() {
		return "Habitacion [m2=" + m2 + ", tipoHabitacion=" + tipoHabitacion + "]";
	}
	
	

}
