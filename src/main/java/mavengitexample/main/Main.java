package mavengitexample.main;

import jakarta.persistence.EntityManager;
import mavengitexample.Banco;
import mavengitexample.config.Conn;

public class Main {

	public static void main(String[] args) {
		EntityManager em = Conn.getInstancia().getFactory().createEntityManager();
		
		Banco bancoSaga = new Banco();
		bancoSaga.setBancoNombre("Saga");
		
		em.getTransaction().begin();
		em.persist(bancoSaga);
		em.getTransaction().commit();
		
		System.out.println("Se creo un nuevo banco");
	}

}
