package livros;

public class Livros {

	private String titulo;
	private String autor;
	private String anoDePublicacao;
	private String generoLiterario;

	public Livros(String titulo, String autor, String anoDePublicacao, String generoLiterario) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoDePublicacao = anoDePublicacao;
		this.generoLiterario = generoLiterario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(String anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	public String getGeneroLiterario() {
		return generoLiterario;
	}

	public void setGeneroLiterario(String generoLiterario) {
		this.generoLiterario = generoLiterario;
	}

	@Override
	public String toString() {
		return "Livros [titulo=" + titulo + ", autor=" + autor + ", anoDePublicacao=" + anoDePublicacao
				+ ", generoLiterario=" + generoLiterario + "]";
	}

}
