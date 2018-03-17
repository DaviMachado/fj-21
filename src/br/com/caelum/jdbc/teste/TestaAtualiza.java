package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAtualiza {
	public static void main(String[] args) {
		
		ContatoDAO dao = new ContatoDAO();
		Contato contato = new Contato();
		
		contato.setNome("davi");
		contato.setEmail("davi@teste.com.br");
		contato.setEndereco("rua teste 123");
		contato.setId(2);
		
		dao.altera(contato);
	}
}
