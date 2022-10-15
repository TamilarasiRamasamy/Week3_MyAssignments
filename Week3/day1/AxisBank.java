package Week3.day1;

public class AxisBank extends BankInfo {
public void deposit() {
    System.out.println("Amount deposited in Axis Bank = Rs.2000");
}
public static void main(String[] args) {
	AxisBank depositAmount = new AxisBank();
	depositAmount.saving();
	depositAmount.fixed();
	//Overriding deposit() of child class
	depositAmount.deposit();
	//Overriding deposit() of Parent Class
	BankInfo depositAmount1 =new BankInfo();
	depositAmount1.deposit();
	
}	
}

