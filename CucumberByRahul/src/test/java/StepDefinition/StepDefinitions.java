package StepDefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class StepDefinitions {

	@Given("User is on Netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
System.out.println("Landing page");
	}

	@When("user logs in with {string} and {string}")
	public void user_logs_in_with_and(String string1, String string2) {
		System.out.println(string1+", "+string2);
	}

	@Then("^Home page is populated$")
	public void Home_page_is_populated() {
		System.out.println("Home_page");
	}

	@And("cards are displyed as {string}")
	public void cards_are_displyed_as(String string) {
		System.out.println("Parameterside string:= "+string);
	}
	@When("user signup with following details")
	public void user_signup_with_following_details(io.cucumber.datatable.DataTable Table) {
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    // For other transformations you can register a DataTableType.
		System.out.println("***************Parameterside string values from table***************");
		
		List<List<String>> obj = Table.asLists();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
		System.out.println(obj.get(0).get(4));
		
		System.out.println("************************************************************************");
	    
	}
	@When("^user2 logs in with user name(.+) and password (.+)$")
	public void user2_logs_in_with_user_nameus1_and_password_pas1(String username,String password) {
	   System.out.println(username+","+password);
	   
	   System.out.println("************************************************************************");
	}


}
