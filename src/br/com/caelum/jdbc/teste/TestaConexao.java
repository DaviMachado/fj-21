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
		System.out.println("Conexão aberta!");
		connection.close();
		
		Contato contato = new Contato();
		contato.setNome("Caelum");
		contato.setEmail("Contato@caelum.com.br");
		contato.setEndereco("R. Vergueiro 3185 cj57");
		contato.setDataNascimento(Calendar.getInstance());
		
		// gave nesssa conexão!!!
		ContatoDAO dao = new ContatoDAO();
		
		// método elegante
		dao.adiciona(contato);
		
		System.out.println("Gravado!");
	}
}
