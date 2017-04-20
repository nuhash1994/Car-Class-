import java.util.Scanner;

public class CarDriver {

	public static void main(String[] args) {
		Car mycar= new Car();
		System.out.println("My car Detail: "+ mycar.toStirng());
		Car hiscar= new Car("Honda", "Black", 400, 3.5);
		System.out.println("\nHis car Detail: "+hiscar.toStirng());
		Car hercar= new Car("Pink","Volks",300,2.5);
		System.out.println("\nHer car Detail: "+hercar.toStirng());
		
		mycar.setmake("Ferrari");
		mycar.setcolor("Blue");
		mycar.sethorsePower(650);
		mycar.setengine(6.5);
		
		hiscar.setmake("Ferrari");
		hiscar.setcolor("Blue");
		hiscar.sethorsePower(650);
		hiscar.setengine(6.5);
		
		hercar.setmake("Ferrari");
		hercar.setcolor("Blue");
		hercar.sethorsePower(650);
		hercar.setengine(6.5);
		
		System.out.println("\nMy car detail after setting value: "+"\nColor: "+mycar.getColor() + "\nHorse Power: " + mycar.getHorsePower() + "\nEngine Size: " +  mycar.getEngine() + "\nName: " + mycar.getMake());
		System.out.println("\nHis car detail after setting value: "+"\nColor: "+hiscar.getColor() + "\nHorse Power: " + hiscar.getHorsePower() + "\nEngine Size: " +  hiscar.getEngine() + "\nName: " + hiscar.getMake());
		System.out.println("\nHer car detail after setting value: "+"\nColor: "+hercar.getColor() + "\nHorse Power: " + hercar.getHorsePower() + "\nEngine Size: " +  hercar.getEngine() + "\nName: " + hercar.getMake());
		
		
		
		

	}

}
