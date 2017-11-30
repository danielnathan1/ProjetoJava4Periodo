package interfacegrafica;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFMenu extends JFrame{
	
	private JPanel panel = new JPanel();
	private JButton btvenda, btresgitro, btconsulta, btsair;
	private JLabel lbTitulo;
	
	public JFMenu(){
		//titulo
		super("MERCADO");
		
		
		//conteiner
		Container c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(102, 102, 51));
	
		//frame
		
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
		
		//Label POR ALGUM MOTIVO N TA FUNCIONANDO
	
		
		
		//botoes
		criarButoes(c);
		criarlabel(c);
		
	}
	private void criarButoes(Container c){
		
		this.btvenda = new JButton("Venda");
		this.btresgitro = new JButton("Registro");
		this.btconsulta = new JButton("Consulta");
		this.btsair = new JButton("Sair");
		
		this.btvenda.setBounds(20, 230, 100, 30);
		this.btresgitro.setBounds(20, 280, 100, 30);
		this.btconsulta.setBounds(20, 330, 100, 30);
		this.btsair.setBounds(20, 530, 100, 30);
		
		c.add(this.btvenda);
		c.add(this.btresgitro);
		c.add(this.btconsulta);
		c.add(this.btsair);
		
		
		
	}
	private void criarlabel(Container c){
		this.lbTitulo = new JLabel("MENU PRINCIPAL");
		this.lbTitulo.setBounds(20, 230, 100, 30);
		this.lbTitulo.setFont(new Font("Arial", Font.BOLD, 400));
		this.lbTitulo.setBackground(Color.BLACK);
		this.lbTitulo.setForeground(Color.BLUE);
		this.lbTitulo.setToolTipText("MENU PRINCIPAL");
		c.add(lbTitulo);
	}
	
	

}
