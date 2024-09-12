import java.time.LocalDate;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		String dueño=validar1("ingrese el nombre del dueño del auto");
		String marca=validar1("ingese la marca del auto");
		String modelo=validar1("ingrese el modelo del auto");
		String patente=validar1("ingrese cual es la patente");
		JOptionPane.showMessageDialog(null, "ok, ya registramos al auto, sugamos");
		
		double motor=validar2("Ingrese el porsentaje que dio el motor después de las pruebas");
		double frenos=validar2("Ingrese el porsentaje que dioeron los frenos después de las pruebas");
		double suspencion=validar2("Ingrese el porsentaje que dio la suspencion después de las pruebas");
		
		VTV auto= new VTV (dueño, marca, modelo, patente,motor, frenos, suspencion);
		JOptionPane.showMessageDialog(null, "ok ahora verifiquemos si paso o no");
		JOptionPane.showMessageDialog(null, "Realizando operaciones...");
		
		String opcion;
		String lista="";
		double porsentajegeneral= (motor+frenos+suspencion)/3;
		if (porsentajegeneral<60) {
			opcion="no";
			if (motor<50) {
				lista= lista+"el motor fallo \n";
			} 
			if (frenos<50) {
				lista=lista+"el freno fallo \n";
			}
			if (suspencion<50) {
				lista=lista+"la suspencion fallo \n";
			}
			JOptionPane.showMessageDialog(null, auto+"\n"+"paso la VTV: "+opcion+"\n"+ lista);
		} else {
			opcion="si";
			LocalDate vencimiento=hoy.plusYears(1);
			JOptionPane.showMessageDialog(null, auto+"\n"+"paso la VTV: "+opcion +"\n"+"vence:" + vencimiento);
		}
		
		
		
	}
	//FUNCIONES
	
	public static String validar1 (String mensaje) {
		
		
		String a=JOptionPane.showInputDialog(mensaje);
		while (a.isEmpty()) {
			a=JOptionPane.showInputDialog("Error: "+mensaje);
		}
		
		return a;
		
	}
	public static int validar2 (String mensaje) {
		boolean flag=true;
		String x;
		do {
		x=JOptionPane.showInputDialog(mensaje);
		while (x.isEmpty()) {
			 x=JOptionPane.showInputDialog("Error: "+ mensaje);
		}
		for (int i = 0; i < x.length(); i++) {
			if (!Character.isDigit(x.charAt(i))) {
				JOptionPane.showMessageDialog(null, "usted no completo un número");
				flag=false;
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Su numero es correcto puede continuar");
			}
		}
		} while (!flag);
		return Integer.parseInt(x);
	}
	

}
