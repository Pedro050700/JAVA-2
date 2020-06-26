package teste;

import dao.ContatoDao;

public class deletarContato {
	public static void main(String[] args) {
		try {
			ContatoDao contatoDao;
			contatoDao = new ContatoDao();
			contatoDao.deletar(5L);
			System.out.println("Contato excluido com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
