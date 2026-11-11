package logica;

public class Parcial {
	
	public String raices(int a, int b, int c) throws Exception {
		if (a==0) {
			throw new Exception("No es una ecuacion de segundo orden");
		}
		else {
			if (((b*b)-4*a*c)<0)
				throw new Exception("La raiz es compleja");
			
			else {
				double raiz1 = (-b+Math.sqrt((b*b)-4*a*c))/(2*a);
				double raiz2 = (-b-Math.sqrt((b*b)-4*a*c))/(2*a);
				
			return("x=" + raiz1 + " , x=" + raiz2);
			
			}
		}
	}
}
