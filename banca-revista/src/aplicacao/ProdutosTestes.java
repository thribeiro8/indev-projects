package aplicacao;

import entidades.Bebida;
import entidades.Doce;
import entidades.Produto;
import entidades.Revista;

public class ProdutosTestes {

	public static void main(String[] args) {

		Produto bebida = new Bebida(1, "Refrigerante", "Coca-Cola");
		Produto revista = new Revista(2, "Insight", "American II");
		Produto doce = new Doce(3, "Chocolate", "Laka");
		
		System.out.println(bebida.getNome() + "-" + revista.getNome() + "-" + doce.getNome());
		
	}

}
