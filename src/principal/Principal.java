package principal;


import java.io.Serializable;
import java.awt.Color;
import java.awt.Container;
import java.io.UnsupportedEncodingException;
import javax.swing.JOptionPane;
import interfacegrafica.JFMenu;
import interfacegrafica.Jpanels;
import produtos.Produto;


public class Principal {
	public static void main(String[] args) throws UnsupportedEncodingException {
			
			String controleDeSwi = "1";
			
			//manipuladordedados
			Persist manipularDados = new Persist();
			String consulta = "";
			char letra;
			
			//produto a ser salvo
			Produto p = new Produto();
		
			
			//container
			Container c = new Container();
			c.setBounds(10, 100, 800, 600);
			c.setBackground(new Color(128,128,128));
			c.setLocation(0,0);
			
			//para gerar os paines
			Jpanels paineis = new Jpanels();
			c.add(paineis.mudarParaMenu());
			
			//
			JFMenu frame = new JFMenu(c);
			frame.add(c);
			
			
			while(controleDeSwi == "1"){
				frame.repaint();
				System.out.println(paineis.getControle());
				
				if(paineis.getControle()!= null){
					controleDeSwi = "0";
					switch (paineis.getControle()) {
					
					case "venda":
						frame.mudarPanel(c, paineis.mudarParaVenda());
						frame.repaint();
						while(paineis.getControle()=="venda"){
							
						}
					
					case "registro":
						System.out.println("a");
						p.limparProduto();
						
						System.out.println("");
						
						frame.mudarPanel(c, paineis.mudarParaRegistro());
						frame.repaint();
						
						while(p.getCodigo()==0){
							
							System.out.println("");
							p = paineis.produto;
							if(p.getCodigo()!=0)
								manipularDados.salvarObjeto(p, "produtos/"+p.getCodigo());
							System.out.println("");
						}
						frame.mudarPanel(c, paineis.mudarParaMenu());
						paineis.controle = null;
						controleDeSwi = "1";
						break;
					case "consulta":
						Venda vendatemporaria = new Venda();
						Produto produtotemporario = new Produto();			
						
						//reinicializando as variaveis para poder reultilziar o msm resurso sem ter que fechar o programa
						consulta = "";
						paineis.setConsulta("");
						
						
						frame.remove(c);
						frame.mudarPanel(c, paineis.mudarParaConsulta());
						frame.repaint();
						
						
						while(consulta == ""){
							consulta = paineis.getConsulta();
							System.out.println(consulta);
							if(consulta!= ""){
								letra = consulta.charAt(0);
								if(letra == 'v'){
									vendatemporaria = (Venda)manipularDados.lerObjeto(consulta);
								}else if(letra == 'p'){
									produtotemporario =(Produto) manipularDados.lerObjeto(consulta);
									JOptionPane.showMessageDialog(null, produtotemporario.mostrarProduto());
								}
								
							}
							
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
