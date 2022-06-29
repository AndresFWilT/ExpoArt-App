package inv.presentacion;

import javax.swing.JOptionPane;

import api.com.cableado.IComunicacion;

 

public class Comunicacion implements IComunicacion {
	@Override
	public void comunicarInformacion() {
		JOptionPane.showMessageDialog(null, "hola");
		
	}
}
	