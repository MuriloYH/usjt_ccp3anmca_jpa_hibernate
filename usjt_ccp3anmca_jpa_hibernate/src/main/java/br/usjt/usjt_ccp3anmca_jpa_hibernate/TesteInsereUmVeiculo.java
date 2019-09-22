package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteInsereUmVeiculo {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Veiculo v = new Veiculo();
		v.setModelo("civic");
		v.setMarca("Honda");
		v.setCor("prata");
		v.setAnoDeFabricacao("2019");
		manager.persist(v);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
