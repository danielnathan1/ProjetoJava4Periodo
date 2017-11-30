package principal;

import java.util.ArrayList;
import java.util.Date;
import produtos.*;

public class Vendas {
	
	private int notafiscal;
	private Date data;
	private ArrayList<Produto> produtos = new ArrayList<>();
	
	public int getNotafiscal() {
		return notafiscal;
	}
	public void setNotafiscal(int notafiscal) {
		this.notafiscal = notafiscal;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	


}
