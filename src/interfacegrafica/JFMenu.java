package interfacegrafica;

import java.awt.Container;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFMenu extends JFrame{
	
	private JPanel panel = new JPanel();
	
	public JFMenu(){
		//informações basicas
		
		
		//titulo
		super("Menu");
		//dimensoes
		setBounds(10, 100, 800, 530);
		//a pagina podera ser fechada
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//o frame poderar ser visto
		setVisible(true);
		//o frame n podera ser redimensionado
		setResizable(false);
		//centralizar a pagina
		setLocationRelativeTo(null);
		
		
		
		
		
		
	}
	
	
	

}
