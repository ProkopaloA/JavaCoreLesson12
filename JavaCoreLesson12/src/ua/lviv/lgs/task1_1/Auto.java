package ua.lviv.lgs.task1_1;

public class Auto {
	private int NumberOfHorsepower;
	private int YearOfManufacture;
	private SteeringWheel steeringWheel;
	private Engine engine;
	public Auto(int numberOfHorsepower, int yearOfManufacture, SteeringWheel wheel, Engine engine) {
		NumberOfHorsepower = numberOfHorsepower;
		YearOfManufacture = yearOfManufacture;
		this.steeringWheel = wheel;
		this.engine = engine;
	}
	public int getNumberOfHorsepower() {
		return NumberOfHorsepower;
	}
	public int getYearOfManufacture() {
		return YearOfManufacture;
	}
	public SteeringWheel getWheel() {
		return steeringWheel;
	}
	public Engine getEngine() {
		return engine;
	}
	@Override
	public String toString() {
		return "Auto [NumberOfHorsepower=" + NumberOfHorsepower + ", YearOfManufacture=" + YearOfManufacture
				+ ", wheel=" + steeringWheel + ", engine=" + engine + "]";
	}
	
	
}
