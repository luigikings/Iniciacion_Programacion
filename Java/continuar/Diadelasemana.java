package continuar;

public class Diadelasemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Pruebas.SABADO);
		Pruebas ds = Pruebas.LUNES;
		System.out.println(ds.getValor());
		
		for(Pruebas d: Pruebas.values()) {
			System.out.println(d);
		}
	}
}
