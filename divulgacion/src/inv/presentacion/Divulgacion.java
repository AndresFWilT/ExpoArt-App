package inv.presentacion;

import javax.swing.JOptionPane;

import api.com.cableado.IDivulgacion; 

public class Divulgacion implements IDivulgacion{

	@Override
	public void divulgarInformacion() {
		JOptionPane.showMessageDialog(null, "hola desde divulgacion");
	}
}
