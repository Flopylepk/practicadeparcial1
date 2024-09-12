
public class VTV {
private String dueño;
private String marca;
private String modelo;
private String patente;
private double motor;
private double frenos;
private double suspencion;

public VTV(String a, String b, String c, String d) {
	this.dueño=a;
	this.marca=b;
	this.modelo=c;
	this.patente=d;
}

public VTV (double a, double b, double c) {
	this.motor=a;
	this.frenos=b;
	this.suspencion=c;
}

}
