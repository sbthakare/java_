package inheritance;

public class Test extends Matches {
	private String ballColor;
	private int noOfDay;

	public Test(String date, String teamNames, int noOfOver, String ballColor, int noOfDay) {
		super(date, teamNames, noOfOver);
		this.ballColor = ballColor;
		this.noOfDay = noOfDay;
	}

	public void display() {
		System.out.println("Test match........");
	}

	@Override
	public String toString() {
		return "Test [ballColor=" + ballColor + ", noOfDay=" + noOfDay + ", date=" + date + ", teamNames=" + teamNames
				+ "]";
	}

}
