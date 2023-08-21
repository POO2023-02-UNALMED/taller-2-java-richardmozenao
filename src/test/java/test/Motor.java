package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	void cambiarRegistro(int n) {
		registro = n;
	}
	void asignarTipo(String aTipo) {
		if (aTipo=="electrico" || aTipo == "gasolina") {
			tipo = aTipo;
		}
	}
	public static void main(String[] args) {	
		
	}
}


