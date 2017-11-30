package vendedores;

public class Vendedores {
	
	private String nome;
	private int codigo;
	private float comissaoTotal;

	
	public Vendedores(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getComissaoTotal() {
		return comissaoTotal;
	}
	public void setComissaoTotal(float comissaoTotal) {
		this.comissaoTotal = comissaoTotal;
	}
	
	

}
