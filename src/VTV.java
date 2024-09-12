
public class VTV {
private String dueño;
private String marca;
private String modelo;
private String patente;
private double motor;
private double frenos;
private double suspencion;

public VTV(String a, String b, String c, String d,double z, double x, double y) {
	this.dueño=a;
	this.marca=b;
	this.modelo=c;
	this.patente=d;
	this.motor=z;
	this.frenos=x;
	this.suspencion=y;
}



@Override
public String toString() {
	return "VTV [dueño=" + dueño + ", marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", motor="
			+ motor + ", frenos=" + frenos + ", suspencion=" + suspencion + "]";
}



}
