package orm.actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import orm.modelo.Tarefa;

public class BuscaTarefas {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		String sql = "select r from Tarefa as r where r.finalizado = :paramFinalizado";
		
		Query query = manager.createQuery(sql);
		query.setParameter("paramFinalizado", true);
		
		List<Tarefa> tarefas = query.getResultList();
		
		for (Tarefa tarefa : tarefas) {
			System.out.println("Descrição: " + tarefa.getDescricao() + "\n");
		}
		
		manager.close();
		
	}
}
