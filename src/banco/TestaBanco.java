package banco;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaBanco {
	public static void main(String[] args) {
		try {
			Connection conectar = ConnectionsBanco.getConnections();
			System.out.println("Banco de dados conectado!");
			conectar.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
