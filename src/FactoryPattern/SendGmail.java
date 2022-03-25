package FactoryPattern;

public class SendGmail implements AbstractRepository{

	@Override
	public void sendAll() {
		// TODO Auto-generated method stub\
		System.out.println("Send all mail by gmail");
		
	}

	@Override
	public void sendList() {
		// TODO Auto-generated method stub
		System.out.println("Send list mail by gmail");
	}



}
