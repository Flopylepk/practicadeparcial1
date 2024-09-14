
public class VTV {
private String dueño;
private String marca;
private String modelo;
private String patente;
private double motor;
private double frenos;
private double suspencion;
private String lista;

public VTV(String a, String b, String c, String d,double z, double x, double y) {
	this.dueño=a;
	this.marca=b;
	this.modelo=c;
	this.patente=d;
	this.motor=z;
	this.frenos=x;
	this.suspencion=y;
	this.lista="";
}
///// GET Y SET dueño
public String getDueño () {
	return this.dueño;
}
public void setDueño (String a) {
	this.dueño=a;
}
///GET Y SET marca
public String getMarca () {
	return this.marca;
}
public void setMarca (String a) {
	this.marca=a;
}
////////GET Y SET modelo
public String getModelo () {
	return this.modelo;
}
public void setModelo (String a) {
	this.modelo=a;
}
///////////GET Y SET patente
public String getPatente () {
	return this.patente;
}
public void setPatente (String a) {
	this.patente=a;
}
/////////////////GET Y SET motor
public double getMotor() {
	return this.motor;
}
public void setMotor (double a) {
	this.motor=a;
}
/////////////////GET Y SET frenos
public double getFrenos() {
return this.frenos;
}
public void setFrenos (double a) {
this.frenos=a;
}
/////////////////GET Y SET suspencion
public double getSuspencion() {
return this.suspencion;
}
public void setSuspencion (double a) {
this.suspencion=a;
}

///////GET Y SET lista
public String getLista() {
	return this.lista;
}
public void setLista(double a, double b, double c) {
	this.motor=a;
	this.frenos=b;
	this.suspencion=c;
	if (this.motor<60) {
		this.lista=this.lista+"El motor fallo al tener "+ this.motor+"% \n";
	}else {
		this.lista=this.lista+"El motor esta bien tiene "+ this.motor+ "% \n";
	}
	if (this.frenos<60) {
		this.lista=this.lista+"Los frenos fallaron al tener "+ this.frenos+"% \n";
	}else {
		this.lista=this.lista+"Los frenos estan bien tiene "+ this.frenos+ "% \n";
	}
	if (this.suspencion<60) {
		this.lista=this.lista+"La suspencion fallo al tener "+ this.suspencion+"% \n";
	}else {
		this.lista=this.lista+"La suspencion esta bien tiene "+ this.suspencion+ "% \n";
	}
}
@Override
public String toString() {
	return "VTV [dueño=" + dueño + ", marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", motor="
			+ motor + ", frenos=" + frenos + ", suspencion=" + suspencion + "\n lista=" + lista + "]";
}



}




