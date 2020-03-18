package homework_11_Generics_Enums_Annotations;

public enum CardSuit {
	
	@MainAnnotation(type = "enum", category="CardGames",
			description ="Contains a set of constants for the suits of a card.") 
	
	Clubs("Clubs"),
	Diamonds("Diamonds"),
	Hearts("Hearts"),
	Spades("Spades");
	
	private String suit;
	
	private CardSuit(String suit) {
		this.suit = suit;
	}
	public String printSuit() {
		return suit;
	}
	
	public static void printSuits() {
		System.out.printf(CardSuit.Clubs + " " + CardSuit.Diamonds + " " + CardSuit.Hearts + " " + CardSuit.Spades +"%n");
	}
	

	
}
