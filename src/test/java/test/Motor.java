package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	void cambiarRegistro(int n) {
		registro = n;
	}
	void asignarTipo(String a) {
		if (a=="electrico" || a == "gasolina") {
			tipo = a;
		}
	}
	public static void main(String[] args) {	
		
	}
}


