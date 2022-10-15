package org.system;

public class Desktop extends Computer{
public void desktopSize() {
	System.out.println("Its size is 16-inch");
}
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.computerModel();
	d.desktopSize();
	
}
}
