package continuar;

public enum Pruebas {
	LUNES("1"), MARTES("2"), MIERCOLES("3"), JUEVES("4"), VIIERNES("5"), SABADO("6") ,DOMINGO("7");
	
	String valor;
	Pruebas(String valor){
		this.valor=valor;
	}
	
	public String getValor() {
		return this.valor;
	}
}
