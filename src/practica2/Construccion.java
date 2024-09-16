package practica2;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Construccion {
private String proyecto;
private String etapas;


public Construccion() {
	this.proyecto="";
	this.etapas="";
}

public String getProyecto() {
	return this.proyecto;
}
public void setProyecto(String a, String b, LocalDate c, String d) {
	this.proyecto="el dueño es: "+a+".\n El cliente es: "+b+".\n La fecha de inicio fue: "+c+".\n La ubicación fue: "+d+".\n";
}
public String getEtapas() {
	return this.etapas;
}
public void setEtapas(String[] a) {
	int b=0;
	LocalDate hoy=LocalDate.now();
	LocalDate vence=hoy.plusYears(1);
	do {
		b=JOptionPane.showOptionDialog(null, "elija la etapa que ya hicieron", null, 0, 0, null, a, a[0]);
		switch (b) {
		case 0:
			JOptionPane.showMessageDialog(null, "usted eligio la opcion Etapa de planeació, veamos como salio");
			int valor=validar2("ingrese un numero del 1 al 10 para ver como salio");
			valor=validar3(valor);
		
			if (valor<5) {
				this.etapas=this.etapas+"Etapa de planeación: su valor fue: "+valor+"Deve ser mejorada"+" vence:"+vence+"\n";
			}else {
				this.etapas=this.etapas+"Etapa de planeación: su valor fue: "+valor+"Esta genial"+" vence:"+vence+"\n";
			}
			break;

		case 1:
			JOptionPane.showMessageDialog(null, "usted eligio la opcion Etapa de creación, veamos como salio");
			int valor1=validar2("ingrese un numero del 1 al 10 para ver como salio");
			valor1=validar3(valor1);
			
			if (valor1<5) {
				this.etapas=this.etapas+"Etapa de creación: su valor fue: "+valor1+"Deve ser mejorada"+" vence:"+vence+"\n";
			}else {
				this.etapas=this.etapas+"Etapa de creación: su valor fue: "+valor1+"Esta genial"+" vence:"+vence+"\n";
			}
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "usted eligio la opcion Etapa de finalización, veamos como salio");
			int valor2=validar2("ingrese un numero del 1 al 10 para ver como salio");
			valor2=validar3(valor2);
			if (valor2<5) {
				this.etapas=this.etapas+"Etapa de creación: su valor fue: "+valor2+"Deve ser mejorada"+" vence:"+vence+"\n";
			}else {
				this.etapas=this.etapas+"Etapa de creación: su valor fue: "+valor2+"Esta genial"+" vence:"+vence+"\n";
			}
			break;
		}
		} while (b!=3);
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
public static int validar3(int a) {
	while (a<1||a>10) {
		a=validar2("el numero deve estar entre 1 y 10");
	}
	return a;
}

@Override
public String toString() {
	return "Construccion [proyecto=" + proyecto + ",\n etapas=" + etapas + "]";
}




}


