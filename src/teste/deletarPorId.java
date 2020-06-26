package teste;

import java.sql.SQLException;
import java.util.Scanner;

import dao.ContatoDao;

public class deletarPorId {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			ContatoDao contatoDao = new ContatoDao();
			contatoDao.deletarPorId(1L);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
