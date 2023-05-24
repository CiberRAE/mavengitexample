package mavengitexample.config;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Conn {
	private static Conn instancia = new Conn();
	private EntityManagerFactory factory;
	
	public Conn() {
		this.factory=Persistence.createEntityManagerFactory("mavengitexample");
	}
	
	public static Conn getInstancia() {
		return instancia;
	}
	
	public EntityManagerFactory getFactory() {
		return factory;
	}
}