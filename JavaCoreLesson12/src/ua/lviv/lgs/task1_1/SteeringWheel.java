package ua.lviv.lgs.task1_1;

public class SteeringWheel {
	private double wheelDiametr;
	private String steeringWheelMaterial;

	public SteeringWheel(double wheelDiametr, String SteeringWheelMaterial) {
		this.wheelDiametr = wheelDiametr;
		this.steeringWheelMaterial = SteeringWheelMaterial;
	}

	public double getWhelDiametr() {

		return wheelDiametr;
	}

	public String getWheelMaterial() {
		return steeringWheelMaterial;
	}

	@Override
	public String toString() {
		return "SteeringWheel [WheelDiametr= " + wheelDiametr + ", SteeringWheelMaterial= " + steeringWheelMaterial
				+ "]";
	}

}
