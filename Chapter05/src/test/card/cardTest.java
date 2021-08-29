package test.card;

public class cardTest {

	public static void main(String[] args) {
		CardCompany cardCompany = CardCompany.getInstance();
		
		Card kimCard = cardCompany.createCard("Kim");
		Card leeCard = cardCompany.createCard("Lee");
		
		System.out.println(kimCard.getCardNumber());
		System.out.println(leeCard.getCardNumber());
	}

}
