package Section11;

import org.testng.annotations.Test;

public class L06_Homepage {

	@Test
	public void Desktop_login() {
		System.out.println("Desktop Login");
	}
	
	@Test
	public void Desktop_addItem() {
		System.out.println("Desktop Add Item");
	}
	
	@Test
	public void Tablet_login() {
		System.out.println("Tablet login");
	}
	
	@Test
	public void Tablet_addItem() {
		System.out.println("Tablet add item");
	}
	
	@Test
	public void Mobile_login() {
		System.out.println("Mobile login");
	}
}
