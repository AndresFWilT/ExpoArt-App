package inv.presentacion;

import javax.swing.JOptionPane;

import api.com.cableado.IGestion;

public class BasesDeDatos implements IGestion {

	@Override
	public void gestionarInformacion() {
		JOptionPane.showMessageDialog(null, "hola desde gestionando datos");
	}

}
