package principal;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JOptionPane;

import interfacegrafica.JFMenu;
import interfacegrafica.Jpanels;
import produtos.Produto;


public class Principal {
	public static void main(String[] args) {
			
			String controleDeSwi = "1";
			
			//manipuladordedados
			Persist manipularDados = new Persist();
			
			//produto a ser salvo
			Produto p = new Produto();
		
			
			//container
			Container c = new Container();
			c.setBounds(10, 100, 800, 600);
			c.setBackground(new Color(102, 102, 51));
			c.setLocation(0,0);
			
			//para gerar os paines
			Jpanels paineis = new Jpanels();
			c.add(paineis.mudarParaMenu());
			
			//
			JFMenu frame = new JFMenu(c);
			frame.add(c);
			
			
			while(controleDeSwi == "1"){
				System.out.println("");
				
				if(paineis.getControle()!= null){
					controleDeSwi = "0";
					switch (paineis.getControle()) {
					
					case "venda":
						
					
					case "registro":
						System.out.println("a");
						p.limparProduto();
						
						System.out.println("");
						frame.mudarPanel(c, paineis.mudarParaRegistro());
						
						while(p.getCodigo()==0){
							
							System.out.println("");
							p = paineis.produto;
							if(p.getCodigo()!=0)
								manipularDados.salvarObjeto(p, "produtos/"+p.getCodigo());
							System.out.println(p.getCodigo());
						}
						frame.mudarPanel(c, paineis.mudarParaMenu());
						paineis.controle = null;
						controleDeSwi = "1";
						break;
	
					default:
						break;
					}

				}
			}
			
	}

}
