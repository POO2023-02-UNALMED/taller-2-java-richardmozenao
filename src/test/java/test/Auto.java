package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	int cantidadCreados;
	
	int cantidadAsientos() {
		int contador = 0;
		for(int i = 0; i<asientos.length;i++) {
			 if (asientos[i] != null) {
				 contador += 1;
			 }
		 }
		return contador;
	}
	
	String verificarIntegridad() {
		boolean original = true;
		for(int i = 0; i<asientos.length; i++) {
			if ((registro != motor.registro || motor.registro != asientos[i].registro) && asientos[i] != null) {
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
