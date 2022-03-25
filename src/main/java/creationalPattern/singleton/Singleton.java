package main.java.creationalPattern.singleton;

public class Singleton {
	//read more volatile in OS memory management
	private static volatile Singleton instance = new Singleton();
	public Singleton getInstance() {
		//double check locking to optimise performance in multi-threading evn
		//if we do not  check null in outer of sync, every thread have to wait for checking instance is null or not, so the performance of system decrease
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
