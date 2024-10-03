package inheritance;

public class T20 extends Matches {
	private String captain;
	protected String stadiumName;

	public T20(String date, String teamNames, int noOfOver, String captain, String stadiumName2) {
		super(date, teamNames, noOfOver);
		this.captain = captain;
		stadiumName = stadiumName2;
	}

	public void display() {
		System.out.println("T20 match going on..");
	}

	@Override
	public String toString() {
		return "T20 [captain=" + captain + ", stadiumName=" + stadiumName + ", date=" + date + ", teamNames="
				+ teamNames + "]";
	}

}
