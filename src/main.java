import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		String dueño=validar1("ingrese el nombre del dueño del auto");
		String marca=validar1("ingese la marca del auto");
		String modelo=validar1("ingrese el modelo del auto");
		String patente=validar1("ingrese cual es la patente");
		
		VTV auto= new VTV (dueño, marca, modelo, patente);
		JOptionPane.showMessageDialog(null, auto);
		
		
		
		
		
	}
	//FUNCIONES
	
	public static String validar1 (String mensaje) {
		
		
		String a=JOptionPane.showInputDialog(mensaje);
		while (a.isEmpty()) {
			a=JOptionPane.showInputDialog("Error: "+mensaje);
		}
		
		return a;
		
	}
	
	

}
