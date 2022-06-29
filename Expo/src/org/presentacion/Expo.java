package org.presentacion;

import javax.swing.JOptionPane;

import api.com.cableado.IComunicacion;
import api.com.cableado.IModerador;
import api.com.utilidades.Cargador;

public class Expo implements IModerador{

	@Override
	public void moderar() {
		Cargador crg = new Cargador("front");
		try {
			Class cls = crg.getClase(IComunicacion.class.getName());
			IComunicacion com =(IComunicacion)cls.newInstance();
			com.comunicarInformacion();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "no hay componentes");
		}
			
		
	}
	public static void main(String[] args) {
		new Expo().moderar();
	}

}
