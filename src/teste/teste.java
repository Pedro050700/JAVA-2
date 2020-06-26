package teste;


import java.util.Scanner;

import dao.ContatoDao;
import modelo.Contato;

public class teste {
	public static void main(String[] args) {
		Contato contato = new Contato();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu nome ?");
		String nome = sc.next();
		
		System.out.println("Informe seu email ?");
		String email = sc.next();
		
		System.out.println("Informe seu endereco ?");
		String endereco = sc.next();
		

		contato.setNome(nome);
		contato.setEmail(email);
		contato.setEndereco(endereco);

		ContatoDao contatoDao;
		try {
			contatoDao = new ContatoDao();
			contatoDao.salvar(contato);
			System.out.println("Informações gravado no banco de dados!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
