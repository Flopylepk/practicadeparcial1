package practica2;

import java.time.LocalDate;

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
	this.proyecto="el dueño es: "+a+". El cliente es: "+b+". La fecha de inicio fue: "+c+". La ubicación fue: "+d+".";
	
}

}