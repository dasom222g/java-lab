package test.card;

public class CardCompany {
	private static CardCompany instance = new CardCompany();
	
	private CardCompany(){};
	
	public static CardCompany getInstance()  {
		if(instance == null) instance = new CardCompany();
		return instance;
	}
	
	// card »ı¼ºÇØÁÜ
	public Card createCard(String name) {
		return new Card(name);
	}
	
}
