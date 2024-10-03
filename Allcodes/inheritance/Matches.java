package inheritance;

public class Matches {
	protected String date;
	protected String teamNames;
	private int noOfOver;

	public Matches(String date, String teamNames, int noOfOver) {
		super();
		this.date = date;
		this.teamNames = teamNames;
		this.noOfOver = noOfOver;
	}

	public void display() {
		System.out.println("Match class");
	}

	@Override
	public String toString() {
		return "Matches [date=" + date + ", teamNames=" + teamNames + ", noOfOver=" + noOfOver + "]";
	}

}
