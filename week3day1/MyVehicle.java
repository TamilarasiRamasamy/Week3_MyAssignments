package week3day1;

public class MyVehicle {
public static void main(String[] args) {
	Car mycar = new Car();
	mycar.applyBrake();
	mycar.soundHorn();
	mycar.openSunroof();
	mycar.turnOnAC();
	
	BMW car1 = new BMW();
	car1.applyBrake();
	car1.soundHorn();
	car1.openSunroof();
	car1.turnOnAC();
	car1.autoPark();
	System.out.println("............................................");
	
	Audi car2 = new Audi();
	car2.applyBrake();
	car2.soundHorn();
	car2.openSunroof();
	car2.turnOnAC();
	car2.hybridFuel();
	car2.applybrake();
	System.out.println("............................................");
	
	Auto myAuto = new Auto();
	myAuto.applyBrake();
	myAuto.soundHorn();
	myAuto.handStarter();
	
	
	Bajaj auto1= new Bajaj();
	auto1.applyBrake();
	auto1.soundHorn();
	auto1.handStarter();
	auto1.electronicMeter();
	
}
}
