package servicos;

import java.util.ArrayList;
import java.util.List;

import modelo.Autor;
import modelo.Editora;
import modelo.Livro;

public class BaseDeDados {

	private List<Livro> livros;
	private List<Autor> autores;
	private List<Editora> editoras;

	public BaseDeDados() {
		livros = new ArrayList<>();
		autores = new ArrayList<>();
		editoras = new ArrayList<>();
	}

	public boolean criarAutor(Autor autor) {
		if (autor != null) {
			return autores.add(autor);
		}
		return false;
	}

	public Autor buscarAutor(String nome) {
		for (Autor autor : autores) {
			if (autor.getNome().equalsIgnoreCase(nome)) {
				return autor;
			}
		}
		return null;
	}

	private boolean removerAutor(Autor autor) {
		if (autores.contains(autor)) {
			return autores.remove(autor);
		}
		return false;
	}

	private Autor atualizarAutor(Autor autor) {
		if (autores.contains(autor)) {
			removerAutor(autor);
			autores.add(autor);
		}
		return autor;
	}

}
