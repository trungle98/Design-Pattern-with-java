package FactoryPattern;

public class SendHotMail implements AbstractRepository{

	@Override
	public void sendAll() {
		// TODO Auto-generated method stub
		System.out.println("Send all mail by HotMail");
	}

	@Override
	public void sendList() {
		// TODO Auto-generated method stub
		System.out.println("Send list mail by HotMail");
	}

}
