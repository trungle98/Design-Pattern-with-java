package FactoryPattern;

public class SendYahooMail implements AbstractRepository {

	@Override
	public void sendAll() {
		// TODO Auto-generated method stub
		System.out.println("Send all mail by YahooMail");
	}

	@Override
	public void sendList() {
		// TODO Auto-generated method stub
		System.out.println("Send list mail by YahooMail");
	}

}
