package practica2;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String dueño=validar1("ingrese el dueño del proyecto");
String cliente=validar1("ingrese el cliente del proyecto");
int dia=validar2("ingrese el dia que inicio el proyecto");
int mes=validar2("ingrese el mes que inicio el proyecto");
int año=validar2("ingrese el año que inicio el proyecto");
LocalDate inicio= LocalDate.of(año, mes, dia);
String uvbación=validar1("ingrese la ubicación del proyecto");

	}

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
