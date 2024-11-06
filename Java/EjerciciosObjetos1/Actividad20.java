/**
 * 
 */
package EjerciciosObjetos1;

/**
 * @author luigi
 *
 */
public class Actividad20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona yo = new Persona();
		yo.setNombre("Pepito");
		System.out.println(yo.getNombre());
		yo.getApellidos("Da Silva");
		System.out.println(yo.getApellidos());
		yo.setAnio(2001);
		yo.setMes(8);
		yo.setDia(14);
		yo.setSexo('M');
		yo.saludar();
		yo.mostrarEdad();
		

	}
	

}