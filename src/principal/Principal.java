package principal;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JOptionPane;

import interfacegrafica.JFMenu;
import interfacegrafica.Jpanels;


public class Principal {
	public static void main(String[] args) {
			
			String controleDeSwi = "1";
		
		
			
			//container
			Container c = new Container();
			c.setBounds(10, 100, 800, 600);
			c.setBackground(new Color(102, 102, 51));
			c.setLocation(0,0);
			
			//para gerar os paines
			Jpanels paineis = new Jpanels();
			c.add(paineis.mudarParaMenu());
			
			JFMenu frame = new JFMenu(c);
			frame.add(c);
			
			
			while(controleDeSwi == "1"){
				System.out.println();
				if(paineis.getControle()!= null){
					switch (paineis.getControle()) {
					case "registro":
						controleDeSwi = "0";
						frame.mudarPanel(c, paineis.mudarParaRegistro());
	
						
						break;
	
					default:
						break;
					}
					if(paineis.getControle() == "registro"){
						frame.mudarPanel(c, paineis.mudarParaRegistro());
					}

				}
			}
			
	}

}
