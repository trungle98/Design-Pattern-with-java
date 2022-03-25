package main.java.creationalPattern.factory;

import main.java.creationalPattern.factory.repository.AbstractRepository;

public class Client {
	AbstractRepository abstractRepository;
	public Client() {
		// TODO Auto-generated constructor stub
		abstractRepository = AbstractFactory.getRepository();
	}
	
	public AbstractRepository getMailRepo() {
		return abstractRepository;
	}
	public void setMailRepo(AbstractRepository abstractRepository) {
		this.abstractRepository = abstractRepository;
	}
	public void sendAll() {
		abstractRepository.sendAll();
	}
	public void sendList() {
		abstractRepository.sendList();
	}
}
