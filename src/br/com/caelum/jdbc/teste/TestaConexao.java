package br.com.caelum.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaConexao {
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conex�o aberta!");
		connection.close();
		
		Contato contato = new Contato();
		contato.setNome("Caelum");
		contato.setEmail("Contato@caelum.com.br");
		contato.setEndereco("R. Vergueiro 3185 cj57");
		contato.setDataNascimento(Calendar.getInstance());
		
		// gave nesssa conex�o!!!
		ContatoDAO dao = new ContatoDAO();
		
		// m�todo elegante
		dao.adiciona(contato);
		
		System.out.println("Gravado!");
	}
}
