package entidad;

import utils.Aleatorio;

public class Espada extends Arma {

	@Override
	public int usar() {
		// TODO Auto-generated method stub
		int daño = Aleatorio.calcularNumero(getDañoMinimo(), getDañoMaximo());
		return daño;
	}

}
