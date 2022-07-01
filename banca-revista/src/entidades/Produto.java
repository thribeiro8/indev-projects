package entidades;

public abstract class Produto {

	private int codigo;
	private String nome;
	private int estoque;
	private double valorUnitario;

	public Produto(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
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

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public void incluirEstoque(int quantidade) {
		this.estoque += quantidade;
	}

	public void tirarEstoque(int quantidade) {
		if (quantidade <= this.estoque) {
			this.estoque -= quantidade;
		} else {
			System.out.println("Estoque indisponível!");
		}
	}

}
