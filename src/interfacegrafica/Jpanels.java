package interfacegrafica;

import java.awt.Color;


import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Jpanels extends JFrame{
	
	public JPanel JmenuPrincpal = new JPanel();
	public String controle;
	
	
	public String getControle() {
		return controle;
	}


	public void setControle(String controle) {
		this.controle = controle;
	}


	public JPanel mudarParaMenu(){
		Font font = new Font("ARIAL", Font.BOLD, 20);
		JLabel jTitulo = new JLabel("MENU PRINCIPAL");
		jTitulo.setBounds(300, 0, 200, 20);
		jTitulo.setFont(font);
		jTitulo.setForeground(Color.BLACK);
		jTitulo.setToolTipText("MENU PRINCIPAL");
		
		
		
		
		
		JmenuPrincpal.setLayout(null);
		JmenuPrincpal.setBounds(10, 100, 800, 600);
		JmenuPrincpal.setBackground(new Color(102, 102, 51));
		
		
		JButton btvenda = new JButton("Venda");
		JButton btresgitro = new JButton("Registro");
		JButton btconsulta = new JButton("Consulta");
		JButton btsair = new JButton("Sair");
		
		btvenda.setBounds(20, 140, 100, 30);
		btresgitro.setBounds(20, 180, 100, 30);
		btconsulta.setBounds(20, 220, 100, 30);
		btsair.setBounds(20, 410, 100, 30);
		
		btvenda.setActionCommand("venda");
		btresgitro.setActionCommand("registro");
		btconsulta.setActionCommand("consulta");
		btsair.setActionCommand("sair");
		
		
		/*
		 * foi criado um listener para cada botao para poder alterar a variavel controle, nessa variavel que irei controlar a troca de paneis
		 */
		
		
		//listener de venda
		btvenda.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() instanceof JButton){
					if(e.getActionCommand().equals("venda")){
						controle = "venda";
					}
					
					
					
				}
			}
		});
		
		//listener de resgristo
		btresgitro.addActionListener(new ActionListener() {
		
		@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() instanceof JButton){
					if(e.getActionCommand().equals("registro")){
						controle = "registro";
					}
					
				}	
			}
		});
			
		//listener de consulta
		btconsulta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() instanceof JButton){
					if(e.getActionCommand().equals("consulta")){
						controle = "consulta";
					}
					
				}
				
				
			}
		});

		
		
		btsair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() instanceof JButton){
					if(e.getActionCommand().equals("sair")){
						JOptionPane.showMessageDialog(null, "OBRIGADO POR USAR O PROGRAMA");
						System.exit(0);
						
					}
				}
				
			}
		
		});
		JmenuPrincpal.add(btvenda);
		JmenuPrincpal.add(btresgitro);
		JmenuPrincpal.add(btconsulta);
		JmenuPrincpal.add(btsair);
		JmenuPrincpal.add(jTitulo);
		return JmenuPrincpal;
	}

}
