package teste;

import java.util.List;

import dao.ContatoDao;
import modelo.Contato;

public class testaLista {
	public static void main(String[] args) {

		try {
			ContatoDao contatoDao;
			contatoDao = new ContatoDao();
			List<Contato> contatos = contatoDao.getLista();

			for (Contato contato : contatos) {
				System.out.println(contato.getNome() + " " + contato.getEmail() + " " + contato.getEndereco()+ "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
