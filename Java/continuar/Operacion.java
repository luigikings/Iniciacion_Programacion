package continuar;

public enum Operacion {
SUMAR(1), RESTAR(2), MULTIPLICAR(3), DIVIDIR(4), POTENCIA(5);
	
	int valor;
	Operacion(int valor) {
		this.valor=valor;
	}

	public int getValor() {
		return valor;
	}
}
