package testngExamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrashanthLifeCycle extends JavaJoesRules{
	
	@Test
	public void driverAndDeliver() {
		System.out.println("Prashanth deliver the pizzas");
	}

	@AfterMethod
	public void returnToStore() {
		System.out.println("Prashanth is Back to Store");

	}
	
	@BeforeClass
	public void changeToDeliveryAttire() {
		System.out.println("Prashanth Changes to delivery attire");
	}

	@BeforeMethod
	public void collectOrder() {
		System.out.println("Prashanth Collects the orders for delivery");
	}
	
	@AfterClass
	public void changeToHisAttire() {
		System.out.println("Prashanth Change to His Attire");

	}

	
}
