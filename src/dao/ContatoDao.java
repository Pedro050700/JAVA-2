package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import banco.ConnectionsBanco;
import modelo.Contato;

public class ContatoDao {
	private Connection connection;
	
	
	public ContatoDao() throws SQLException {
		connection = ConnectionsBanco.getConnections();
	}
	
	
	// METODO QUE SALVA AS INFORMAÇÕES DO CONTATO NO BANCO DE DADOS
	public void salvar(Contato contato) throws SQLException {
		
		String sql = "insert into contatos (nome, email, endereco) values (?,?,?)"; 
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.setString(1, contato.getNome());
		preparedStatement.setString(2, contato.getEmail());
		preparedStatement.setString(3, contato.getEndereco());
		preparedStatement.execute();
		preparedStatement.close();
		connection.close();	
	}
	
	public List<Contato> getLista() throws SQLException {
		String sql = "select * from contatos";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		List<Contato> contatos = new ArrayList<Contato>();
		
		while (resultSet.next()) {
			Contato contato = new Contato();
			contato.setNome(resultSet.getString("nome"));
			contato.setEndereco(resultSet.getString("endereco"));
			contato.setEmail(resultSet.getString("email"));

			contatos.add(contato);
		}
		
		resultSet.close();
		preparedStatement.close();
		connection.close();
		return contatos;
	}
	
	public void deletar(Long id) throws SQLException {
		String sql = "delete from contatos where id = " + id + "";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.execute();
		preparedStatement.close();
		connection.close();
		
	}
	
	
	public List<Contato> pesquisa(String nome) throws SQLException {
		String sql = "select * from contatos where nome like '"+ nome +"%'";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		List<Contato> contatos = new ArrayList<Contato>();
		
		while (resultSet.next()) {
			Contato contato = new Contato();
			contato.setNome(resultSet.getString("nome"));
			contato.setEndereco(resultSet.getString("endereco"));
			contato.setEmail(resultSet.getString("email"));

			contatos.add(contato);
		}
		
		resultSet.close();
		preparedStatement.close();
		connection.close();
		return contatos;
	}
	
	public void deletarPorId(long Id) throws SQLException {
		String sqlDelete = "DELETE FROM contatos WHERE id = " + Id;
		PreparedStatement preparedStatement = connection.prepareStatement(sqlDelete);
		preparedStatement.execute();
		preparedStatement.close();
		connection.close();
		
	}
	
}
