package continuar;

public enum MenuCalculadora {
	AÑADIR(1), MOSTRARLISTA(2), OPERACION(3), SALIR(4), LIMPIAR(5);

	int valor;
	MenuCalculadora(int valor) {
		this.valor=valor;
	}

	public int getValor() {
		return valor;
	}
}