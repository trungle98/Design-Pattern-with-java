package main.java.creationalPattern.singleton;

public class Singleton {
	private static volatile Singleton instance = new Singleton();
	public Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
					return instance;
				}
			}
		}
		return instance;
	}
}
