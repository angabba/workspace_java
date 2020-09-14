
public class Produto {
	private int    codigo;
	private String descricao;
	private double preco;
	
	public Produto(int codigo, String descricao, double preco) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void finalize() {
		System.out.println("Removendo o objeto "+codigo);	
	}
	
	public boolean equals(Produto outro) {
		if (this.codigo == outro.getCodigo() && this.descricao.equals(outro.getDescricao()) && this.preco == outro.getPreco()) {
			return true;
		}
		return false;
	}


}
