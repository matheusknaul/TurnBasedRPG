package main.com.matheusknaul.turnbasedrpg.rules;

public class Lucky {
	private final int number;

	public Lucky() {
		super();
		this.number = (int) (Math.random() * 20);

	}

	public double getNumber() {
		return number;
	}

	
	
	
	
}
