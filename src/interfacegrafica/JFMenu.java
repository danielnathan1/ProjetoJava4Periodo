package interfacegrafica;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class JFMenu extends JFrame{
	
	private JPanel panel = new JPanel();
	private JButton btvenda, btresgitro, btconsulta, btsair;
	private JLabel lbTitulo;
	
	public JFMenu(Container c){
		//titulo
		super("MERCADO");
		
		//dimensoes
		setBounds(10, 100, 800, 600);
			//a pagina podera ser fechada
		setDefaultCloseOperation(EXIT_ON_CLOSE);
			//o frame poderar ser visto
		setVisible(true);
			//o frame n podera ser redimensionado
		setResizable(true);
			//centralizar a pagina
		setLocationRelativeTo(null);
			//icone
		ImageIcon icone = new ImageIcon("C:\\Users\\danie\\Documents\\faculdade\\P4\\Java avancado\\Mercado\\src\\interfacegrafica\\imagens\\icone.png");
		setIconImage(icone.getImage());
		
		//conteiner
		
		 c = this.getContentPane();
		 c.setLayout(null);
		 c.setBackground(new Color(102, 102, 51));
		 
		
	}
	public void mudarPanel(Container c, JPanel novoPanel){
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(102, 102, 51));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.removeAll();
		c.add(novoPanel);
		
		
	}
	
	

}