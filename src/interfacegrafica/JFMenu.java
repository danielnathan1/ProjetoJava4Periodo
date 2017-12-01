package interfacegrafica;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ouvintes.Ouvintebt1;

public class JFMenu extends JFrame{
	
	private Ouvintebt1 ouvintebt = new Ouvintebt1();
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
		 
		//panel
		//panel.setBounds(10, 100, 800, 600);
		//panel.setLayout(null);
		//panel.setBackground(new Color(102, 102, 51));
	
		//frame
		
	
		
		//adicionando o ouvinte aos botoes
		//this.btvenda.addActionListener(this.ouvintebt);
		//this.btresgitro.addActionListener(this.ouvintebt);
		//this.btconsulta.addActionListener(this.ouvintebt);
		//this.btsair.addActionListener(this.ouvintebt);
	
		//definindo comandos associado
		
		//this.btvenda.setActionCommand("venda");
		//this.btresgitro.setActionCommand("registro");
		//this.btconsulta.setActionCommand("consulta");
		//this.btsair.setActionCommand("sair");
		
			
		//adicionando os botoes ao container
		//this.panel.add(this.btvenda);
		//this.panel.add(this.btresgitro);
		//this.panel.add(this.btconsulta);
		//this.panel.add(this.btsair);
			
		//c.add(panel);
		//criarlabel(c);
		
	}
	private void mundarPanel(Container c, JPanel novoPanel){
		c.removeAll();
		c.add(novoPanel);
		
		
	}
	private void criarlabel(Container c){
		this.lbTitulo = new JLabel("MENU PRINCIPAL");
		this.lbTitulo.setBounds(300, 20, 200, 20);
		this.lbTitulo.setFont(new Font("Arial", Font.BOLD, 20));
		this.lbTitulo.setForeground(Color.BLACK);
		this.lbTitulo.setToolTipText("MENU PRINCIPAL");
		c.add(lbTitulo);
	}
	
	

}