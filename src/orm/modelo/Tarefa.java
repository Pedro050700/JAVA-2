package orm.modelo;

import java.util.Calendar;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name ="Tarefas")
public class Tarefa {
	// A ANOTAÇÃO @ID identifica o atributo 
	//como chave primária
	// A anotação @GeneratedValue identifica
	// o atributo como auto incremento ou sequence 
	@Id
	@GeneratedValue
	private long id ;
	//@Column(name = "descricao_tarefa", nullable = false)
	private String descricao;
	private boolean finalizado;
	@Temporal(TemporalType.DATE)
	private Calendar dateFinalizacao;
	
	public long getId()
	{
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isFinalizado() {
		return finalizado;
	}
	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
	public Calendar getDateFinalizacao() {
		return dateFinalizacao;
	}
	public void setDateFinalizacao(Calendar dateFinalizacao) {
		this.dateFinalizacao = dateFinalizacao;
	}
	public void setDataFinalizacao(Calendar instance) {
		// TODO Auto-generated method stub
		
	}
	
}
