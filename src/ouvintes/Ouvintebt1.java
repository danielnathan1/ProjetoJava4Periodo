package ouvintes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;


/*
 * essa eh uma classe ouvinte para tratar os eventos promovidos pelos butoes
 */
public class Ouvintebt1 implements ActionListener{
	JButton jb = new JButton("");
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		
		//se o evento for um botao ira copiar esse butao apra jb para apartir dele poder tratar o evento
		if(evento.getSource() instanceof JButton){
			JButton jb= (JButton) evento.getSource();
			
			if(jb.getActionCommand().equals("venda")){
				
			}else if(jb.getActionCommand().equals("registro")){
				
			}else if(jb.getActionCommand().equals("consulta")){
				
			}else if(jb.getActionCommand().equals("sair")){
				JOptionPane.showMessageDialog(null, "OBRIGADO POR USAR O PROGRAMA");
				System.exit(0);
				
			}
			
		}
		
	}
	
	

}