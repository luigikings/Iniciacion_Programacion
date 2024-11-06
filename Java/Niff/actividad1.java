/**
 * 
 */
package Niff;

/**
 * @author luigi
 *
 */
public class actividad1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Nif minif = new Nif(3933196, 'Y');
		System.out.println(minif.getDni()+ "-"+minif.getLetra());
		minif.setLetra('U');
		System.out.println(minif.getDni()+ "-"+minif.getLetra());
		minif.setLetra('D');
		
		


	}

}
