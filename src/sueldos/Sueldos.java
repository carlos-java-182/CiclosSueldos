package sueldos;

import javax.swing.JOptionPane;

public class Sueldos {

	public static void main(String[] args) {
		
		float sueldos, suma = 0, conta=0;
		
		for(int i=1; i<=10; i++) {
			
			sueldos = Float.parseFloat(JOptionPane.showInputDialog("Digita un sueldo"));
			suma+=sueldos;
			
			if (sueldos>1000) {
				conta++;
			}
						
		}

			System.out.println("La suma de los sueldos es: "+suma);
			System.out.println("Hay "+conta+" sueldos mayores a 1000");
		
	}

}
