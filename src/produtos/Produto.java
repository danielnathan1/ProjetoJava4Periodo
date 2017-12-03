package produtos;

import java.io.Serializable;

public class Produto implements Serializable {
	
	private int codigo;
	private String nome;
	private String descricao;
	public float preco;
	
	
	public void limparProduto(){
		this.setCodigo(0);
		this.setNome(null);
		this.setDescricao(null);
		this.setPreco(0);
		
	}
	
	
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}

}
