package practica2;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

Construccion inicio=new Construccion();

//proyecto

String dueño=validar1("ingrese el dueño del proyecto");
String cliente=validar1("ingrese el cliente del proyecto");
int dia=Construccion.validar2("ingrese el dia que inicio el proyecto");
int mes=Construccion.validar2("ingrese el mes que inicio el proyecto");
int año=Construccion.validar2("ingrese el año que inicio el proyecto");
LocalDate inicio2= LocalDate.of(año, mes, dia);
String ubicación=validar1("ingrese la ubicación del proyecto");

inicio.setProyecto(dueño, cliente, inicio2, ubicación);

//Etapas

String [] opcion={"Etapa de planeació", "Etapa de creación", "Etapa de finalización", "Salir"};
inicio.setEtapas(opcion);

JOptionPane.showMessageDialog(null, inicio+"las etapas que no se ven en esta lista es porque faltan evaluarlas");

	}

public static String validar1 (String mensaje) {
		
		
		String a=JOptionPane.showInputDialog(mensaje);
		while (a.isEmpty()) {
			a=JOptionPane.showInputDialog("Error: "+mensaje);
		}
		
		return a;
		
	}

}
