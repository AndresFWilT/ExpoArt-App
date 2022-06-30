package inv.presentacion;

import javax.swing.JOptionPane;

import api.com.cableado.IOpinion; 

public class Opinion implements IOpinion{

	@Override
	public void criticaInformacion() {
		JOptionPane.showMessageDialog(null, "hola desde opinion");
	}

}
