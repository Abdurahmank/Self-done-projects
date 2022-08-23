package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@sanity") //if we want run b4 hook for specific tags
	public void before_validation() {
		System.out.println("+++++++++++++++++++b4 @sanity scenario validation+++++++++++++++++++");
	}
	
	@After("@sanity") //if we want run after hook for specific tags
	public void after_validation() {
		System.out.println("+++++++++++++++++++after @sanity scenario validation+++++++++++++++++++");
	}
	
	@Before //if we want run b4 hook for all scenarios
	public void before_validation1() {
		System.out.println("+++++++++++++++++++b4 each scenario validation+++++++++++++++++++");
	}
	@After //if we want run after hook for all scenarios
	public void after_validation1() {
		System.out.println("+++++++++++++++++++after each scenario validation+++++++++++++++++++");
	}
}
