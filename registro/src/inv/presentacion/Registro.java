package inv.presentacion;

import javax.swing.JOptionPane;

import api.com.cableado.IRegistro;

public class Registro implements IRegistro {

	@Override
	public void registrarInformacion() {
		JOptionPane.showMessageDialog(null, "hola desde registro");
	}

}
