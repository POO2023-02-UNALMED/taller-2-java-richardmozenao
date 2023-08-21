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
		Auto bmw = new Auto();
		bmw.asientos = new Asiento[5];
		bmw.asientos[0] = new Asiento();
		bmw.asientos[4] = new Asiento();
		System.out.println(bmw.cantidadAsientos());
	}
}


