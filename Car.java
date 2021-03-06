
public class Car {
	private String make;
	private String color;
	private int horsePower;
	private double engine;

	public Car() {
		make = "Honda";
		color = "Gray";
		horsePower = 350;
		engine = 3.5;
	}

	public Car(String make, String color, int horsePower, double engine) {
		this.make = make;
		this.color = color;
		this.horsePower = horsePower;
		this.engine = engine;
	}

	public void setmake(String make) {
		this.make = make;
	}

	public void setcolor(String color) {
		this.color = color;
	}

	public void sethorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public void setengine(double engine) {
		this.engine = engine;
	}

	public String getMake() {
		return this.make;
	}

	public String getColor() {
		return this.color;
	}

	public int getHorsePower() {
		return this.horsePower;
	}

	public double getEngine() {
		return this.engine;
	}

	public String toStirng() {
		return "\nName: " + this.make + "\ncolor: " + this.color + "\nHorse Power: " + this.horsePower
				+ "\nEngine Size: " + this.engine;
	}

}
