package test;

public class Auto {
	String odelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	int cantidadCreados;
	
	int cantidadAsientos() {
		 return asientos.length;
	}
	
	String verificarIntegridad() {
		boolean original = true;
		for(int i = 0; i<asientos.length; i++) {
			if (registro != motor.registro || motor.registro != asientos[i].registro) {
				original = false;
				break;
			}
		}
		if (original == true) {
			return "Auto original";
			
		}else {
			return "Las piezas no son originales";
		}
	}
	
}
