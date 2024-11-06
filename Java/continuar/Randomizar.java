package continuar;

import java.util.Random;

public class Randomizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rd = new Random();
		System.out.println(rd.nextBoolean());
		
		System.out.println(rd.nextInt(0,15));
		System.out.println(rd.nextInt());
		
		System.out.println(rd.nextDouble());
		
		System.out.println(rd.nextDouble(2,6));
		
		System.out.println(rd.nextExponential());
		
		System.out.println(rd.nextGaussian());
	}

}
