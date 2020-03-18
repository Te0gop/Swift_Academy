package homework_11_Generics_Enums_Annotations;

public class Card {
	
	
	@MainAnnotation(type = "class", category="CardGames",
			description ="Represents a card object used to play games with.") 
	
	
	
	
	private CardSuit suit;
	private CardRank rank;
	
	public Card(CardSuit suit, CardRank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	public Card() {
		CardSuit suit;
		CardRank rank;
	}

	
	@Override
	public String toString() {
		return rank + " of " + suit;
	}
	
	public String getSuit() {
		return suit.printSuit();
	}
	public int getRank() {
		return rank.getRank();
	}
	public static void deck() {
		for (CardSuit suit : CardSuit.values()) {
			for (CardRank rank : CardRank.values()) {
				Card card = new Card(suit, rank);
				System.out.println(card);
			}
		}
	}
	
	
	
}
	
