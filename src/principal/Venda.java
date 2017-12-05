package principal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import produtos.*;

public class Venda implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String data;
	public ArrayList<Produto> produtos = new ArrayList<>();
	public float valorTotal;
	
	public String mostrarVenda(){
		String retorno = "";
		retorno = "DADOS DA COMPRA\n\n" + "DATA/ID DA COMPRA: " + this.data + "\nPRODUTOS DA COMPRA\n";
		
		
		for(Produto produto: produtos){
			try {
				retorno += "\n" +"Nome: " + produto.getNome() + "    preco:R$"+ produto.preco;
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "UM PRODUTO NULLO FOI ADICIONADO A VENDA");
			}
			
			
		}
		
		retorno+= "\n\nVALOR TOTAL:R$ " + this.valorTotal;
		
		return retorno;
	}
	
	

	public float getValorTotal() {
		return valorTotal;
	}



	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}



	public String getData() {
		return data;
	}
	public void setData(String string) {
		this.data = string;
	}
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	


}
