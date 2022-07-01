package testes;

import javax.swing.JOptionPane;

import livros.Acervo;
import livros.Livros;

public class Cadastro {

	public static void main(String[] args) {

		while (true) {
			String nomeDoLivro = JOptionPane.showInputDialog("Digite o nome do livro: ");
			String nomeDoAutor = JOptionPane.showInputDialog("Digite o nome do autor: ");
			String anoDePublicacao = JOptionPane.showInputDialog("Digite o nome do ano de publicacao: ");
			String[] valores = { "AVENTURA", "FANTASIA", "FICÇÃO", "COMÉDIA", "FANTASIA", "TERROR" };
			String seletor = (String) JOptionPane.showInputDialog(null, "Escolha o gênero literário", "Gênero",
					JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);

			Livros abcdLivros = new Livros(nomeDoLivro, nomeDoAutor, anoDePublicacao, seletor);
			Acervo.adicionar(abcdLivros);

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais livros? ");

			if (escolha == 1) {
				break;
			}
		}

		System.out.println(Acervo.listar());
		int buscar = JOptionPane.showConfirmDialog(null, "Buscar livro por gênero? ");

		if (buscar == 0) {
			String[] valores2 = { "AVENTURA", "FANTASIA", "FICÇÃO", "COMÉDIA", "FANTASIA", "TERROR" };
			String seletor2 = (String) JOptionPane.showInputDialog(null, "Escolha o gênero literário", "Gênero",
					JOptionPane.QUESTION_MESSAGE, null, valores2, valores2[0]);

			Acervo quant = new Acervo();
			System.out
					.println("Quantidade de livros encontrados por gênero " + seletor2 + " = " + quant.buscar(seletor2) + ".");
		}

	}
}
