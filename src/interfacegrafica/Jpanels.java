package interfacegrafica;

import java.awt.Color;


import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import produtos.Produto;


public class Jpanels extends JFrame{
	
	//fonte padrao
	public Font font = new Font("ARIAL", Font.BOLD, 20);
	//paineis para troca de tela
	public JPanel jMenuPrincpal = new JPanel();
	public JPanel jVenda = new JPanel();
	public JPanel jRegistro = new JPanel();
	//variavel de controle de troca de telas
	public String controle;
	//objetos que irao retornar
	public Produto produto = new Produto();
	
	
	public String getControle() {
		return controle;
	}


	public void setControle(String controle) {
		this.controle = controle;
	}

	public JPanel mudarParaRegistro(){
		
		
		JLabel jTitulo = new JLabel("REGISTRO");
		jTitulo.setBounds(300, 0, 200, 20);
		jTitulo.setFont(font);
		jTitulo.setForeground(Color.BLACK);
		jTitulo.setToolTipText("REGISTRO");
		
		JLabel txareaCodigo = new JLabel("Codigo:");
		JLabel txareaNome = new JLabel("Nome:");
		JLabel txareaDescricao = new JLabel("Descricao:");
		JLabel txareaValor = new JLabel("Valor:");
		
		
		
		
		jRegistro.setLayout(null);
		jRegistro.setBounds(10, 100, 800, 600);
		jRegistro.setBackground(new Color(102,102,51));
		
		//textfield
		JTextField txCodigo = new JTextField(20);
		JTextField txNome = new JTextField(20);
		JTextField txDescricao = new JTextField(20);
		JTextField txValor = new JTextField(20);
		
		txCodigo.setText("");
		txNome.setText("");
		txDescricao.setText("");
		txValor.setText("");
		
		//botoes
		JButton btregistrar = new JButton("Registrar");
		JButton btlimpar = new JButton("limpar");
		
		
		btregistrar.setBounds(200, 310, 100, 20);
		btlimpar.setBounds(400, 310, 100, 20);
		
		//campos para preeencher
		txCodigo.setBounds(200, 80, 300, 20);
		txCodigo.setToolTipText("Codigo");
		txNome.setBounds(200, 120, 300, 20);
		txNome.setToolTipText("Nome");
		txDescricao.setBounds(200, 170, 300, 40);
		txDescricao.setToolTipText("Descricao");
		txValor.setBounds(200, 240, 300, 20);
		txValor.setToolTipText("valor");
		
		//indicacoes dos campos
		txareaCodigo.setBounds(150, 80, 300, 15);
		txareaNome.setBounds(150, 120, 300, 15);
		txareaDescricao.setBounds(130, 170, 300, 15);
		txareaValor.setBounds(150, 240, 300, 15);
		//cores
		
		//cores
		txareaCodigo.setForeground(Color.BLACK);
		txareaNome.setForeground(Color.BLACK);
		txareaDescricao.setForeground(Color.BLACK);
		txareaValor.setForeground(Color.BLACK);
		
		
		btlimpar.setActionCommand("limpar");
		btlimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() instanceof JButton){
					if(e.getActionCommand().equals("limpar")){
						txCodigo.setText("");
						txNome.setText("");
						txDescricao.setText("");
						txValor.setText("");
					}
				}
				
				
			}
		});
		
		btregistrar.setActionCommand("registrar");
		btregistrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() instanceof JButton){
					if(!txCodigo.getText().equals("") && !txNome.getText().equals("") && !txDescricao.getText().equals("") && !txValor.getText().equals("")){
						produto.setCodigo(Integer.parseInt(txCodigo.getText()));
						produto.setNome(txNome.getText());
						produto.setDescricao(txDescricao.getText());
						produto.setPreco(new Float(txValor.getText()).floatValue());
						JOptionPane.showMessageDialog(null, "OBRIGADO POR USAR O PROGRAMA");
						
					}else{
						JOptionPane.showMessageDialog(null, "POR FAVOR, PREENCHA TODOS OS CAMPOS");
					}
					
				}
			}
		});
		
		
		
		
		jRegistro.add(jTitulo);
		
		jRegistro.add(btregistrar);
		jRegistro.add(btlimpar);
		
		jRegistro.add(txCodigo);
		jRegistro.add(txNome);
		jRegistro.add(txDescricao);
		jRegistro.add(txValor);
		
		jRegistro.add(txareaCodigo);
		jRegistro.add(txareaNome);
		jRegistro.add(txareaDescricao);
		jRegistro.add(txareaValor);
		
		return jRegistro;
	}
	public JPanel mudarParaMenu(){
		JLabel jTitulo = new JLabel("MENU PRINCIPAL");
		jTitulo.setBounds(300, 0, 200, 20);
		jTitulo.setFont(font);
		jTitulo.setForeground(Color.BLACK);
		jTitulo.setToolTipText("MENU PRINCIPAL");
		
		
		
		
		
		jMenuPrincpal.setLayout(null);
		jMenuPrincpal.setBounds(10, 100, 800, 600);
		jMenuPrincpal.setBackground(new Color(102, 102, 51));
		
		
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
		jMenuPrincpal.add(btvenda);
		jMenuPrincpal.add(btresgitro);
		jMenuPrincpal.add(btconsulta);
		jMenuPrincpal.add(btsair);
		jMenuPrincpal.add(jTitulo);
		
		return jMenuPrincpal;
	}
	
	

}
