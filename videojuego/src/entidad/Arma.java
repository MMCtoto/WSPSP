package entidad;

public abstract class Arma {
	private int dañoMinimo;
	private int dañoMaximo;
	private String tipo;
	private Personaje personaje;
	
	public abstract int usar();

	public int getDañoMinimo() {
		return dañoMinimo;
	}

	public void setDañoMinimo(int dañoMinimo) {
		this.dañoMinimo = dañoMinimo;
	}

	public int getDañoMaximo() {
		return dañoMaximo;
	}

	public void setDañoMaximo(int dañoMaximo) {
		this.dañoMaximo = dañoMaximo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}

	@Override
	public String toString() {
		return "Arma [dañoMinimo=" + dañoMinimo + ", dañoMaximo=" + dañoMaximo + ", tipo=" + tipo + ", personaje="
				+ personaje.getNombre() + "]";
	}
	
	
}