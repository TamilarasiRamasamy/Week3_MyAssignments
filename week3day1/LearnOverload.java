package week3day1;

public class LearnOverload {
public void add(int a, int b) {
	
	System.out.println("Sum of 2 integers a+b = "+(a+b));
}
public void add(int a,int b,int c) {
	System.out.println("Sum of 3 integers a+b+c = " + (a+b+c));
}
public void add(float a, float b) {
	System.out.println("Sum of two Float values a+b = " + (a+b));
}
public void add(float a, int b) {
	System.out.println("Sum of 1 float & 1 integer value = " + (a+b));
}
public static void main(String[] args) {
	LearnOverload sum = new LearnOverload();
	sum.add(12,8);
	sum.add(20, 99, 1);
	sum.add(17.7f, 82.3f);
	sum.add(45.0f, 65);
}
}
