package entidad;

import utils.Aleatorio;

public class Hechizo extends Arma{

	@Override
	public int usar() {		
		// TODO Auto-generated method stub
		int daño = Aleatorio.calcularNumero(getDañoMinimo(), getDañoMaximo());
		int magiaCaos = Aleatorio.calcularNumero(1, 100);
		if(magiaCaos <= 25) {
			System.out.println("Hechizado quedaste!!!!");
			daño *= 2;//en caso de magia del caos, DOBLE DAÑO
		}
		return daño;
	}

}
