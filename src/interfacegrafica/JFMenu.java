package interfacegrafica;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class JFMenu extends JFrame{
	
	private JPanel panel = new JPanel();
	BufferedImage imagemfundo;
	
	public JFMenu(Container c){
		//titulo
		super("MERCADO");
		
		//dimensoes
		setBounds(10, 100, 800, 600);
			//a pagina podera ser fechada
		setDefaultCloseOperation(EXIT_ON_CLOSE);
			//o frame poderar ser visto
		setVisible(true);
			//
		
		setResizable(false);
			//centralizar a pagina
		setLocationRelativeTo(null);
			//icone
		ImageIcon icone = new ImageIcon("C:\\Users\\danie\\Documents\\faculdade\\P4\\Java avancado\\Mercado\\src\\interfacegrafica\\imagens\\icone.png");
		setIconImage(icone.getImage());
		
		//conteiner
		 c = this.getContentPane();
		 c.setLayout(null);
		 c.setBackground(new Color(173,216,230));
		 
		
	}
	public void mudarPanel(Container c, JPanel novoPanel){
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(173,216,230));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.removeAll();
		c.add(novoPanel);
		
		
	}
	
	

}