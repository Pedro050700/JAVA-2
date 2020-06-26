package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.ContatoDao;
import modelo.Contato;

public class pesquisaContato {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome que queira pesquisar:");
		String ps = sc.next();
		
		try {
			ContatoDao dao = new ContatoDao();
			List<Contato> contatos = dao.pesquisa(ps);

			for (Contato contato : contatos) {
				System.out.println("Nome: " + contato.getNome() + " \nEmail: " + contato.getEmail() + " \nEndereço: " + contato.getEndereco());
				System.out.println("-");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
