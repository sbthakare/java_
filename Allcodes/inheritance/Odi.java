package inheritance;

public class Odi extends Matches {
	private int noOfHour;

	public Odi(String date, String teamNames, int noOfOver, int noOfHour) {
		super(date, teamNames, noOfOver);
		this.noOfHour = noOfHour;
	}

	public void display() {
		System.out.println("Odi MAtch...");
	}

	@Override
	public String toString() {
		return "Odi [noOfDay=" + noOfHour + ", date=" + date + ", teamNames=" + teamNames + "]";
	}

}
