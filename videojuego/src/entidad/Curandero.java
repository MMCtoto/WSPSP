package entidad;

public class Curandero extends Personaje{
	private int sabiduria;
	
	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}

	@Override
	public void atacar(Personaje p) {
		System.out.println("Curacione maxime!");
		int daño = getArma().usar();
		if(getArma() instanceof Rezo){
			daño += sabiduria;
		}
		p.setPuntosVida(p.getPuntosVida() - daño);
		System.out.println(this.getNombre() + 
				" Hace un daño de: " + daño);
	}
	
	
	

}
