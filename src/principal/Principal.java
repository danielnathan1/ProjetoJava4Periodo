package principal;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JOptionPane;

import interfacegrafica.JFMenu;
import interfacegrafica.Jpanels;


public class Principal {
	public static void main(String[] args) {
		
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
			
			while(true){
				if(paineis.getControle()=="venda"){
					System.out.println("aqui");
				}else{
					System.out.println(paineis.getControle());
				}
			}
			
	}

}
