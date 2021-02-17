package entidad;

public class Guerrero extends Personaje{
	private int fuerza;

	@Override
	public void atacar(Personaje p) {
		System.out.println("Yiahhhhhh");
		int daño = getArma().usar();
		if(getArma() instanceof Espada || getArma() instanceof Arco) {
			daño += fuerza;
		}
		
		p.setPuntosVida(p.getPuntosVida() - daño);
		System.out.println(this.getNombre() + 
				" Hace un daño de: " + daño);
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	
	
}
