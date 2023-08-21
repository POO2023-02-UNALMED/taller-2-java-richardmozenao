package test;

public class Asiento {
	String color;
	static String[] paleta = {"rojo","verde","amarillo","negro","blanco"};
	int precio;
	int registro;
	void cambiarColor(String c) {
		for (int i = 0; i<paleta.length; i++) {
			if (paleta[i] == c) {
				color = c;
				break;
				
			}
			
		}
	}
}
