package homework_11_Generics_Enums_Annotations;

public enum CardRank {
	
	@MainAnnotation(type = "enum", category="CardGames",
			description ="Contains a set of constants for the ranks of a card.") 
	
	Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10), Jack(11), 
	Queen(12), King(13), Ace(14);
	
	private int rankValue;
	
	private CardRank(int rankValue) {
		this.rankValue = rankValue;
		
	}
	public int getRank() {
		return rankValue;
	}
	
	public static void printRank() {
		System.out.printf(CardRank.Two + " " + CardRank.Three + " " + CardRank.Four + " " + 
	      CardRank.Five + " " + CardRank.Six + " " + CardRank.Seven + " " + CardRank.Eight + " " +
			CardRank.Nine + " " + CardRank.Ten + " " + CardRank.Jack + " " + CardRank.Queen + " " +
				CardRank.King + " " + CardRank.Ace + "%n");
	}
}
