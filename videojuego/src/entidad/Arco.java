package entidad;

import utils.Aleatorio;

public class Arco extends Arma{

	@Override
	public int usar() {
		// TODO Auto-generated method stub
		int daño = Aleatorio.calcularNumero(getDañoMinimo(), getDañoMaximo());
		return daño;
	}

}