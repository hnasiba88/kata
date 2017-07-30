package CucumberFirstStep.Cucumber;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en_au.When;

public class AccountSteps {
	 
    Personne personne = new Personne("Pierre-Jean");
    Account account = new Account(personne);
 
    @Given("^An existing client named Pierre-Jean with (\\d+) EUR in his account$")
    public void deposit(int amount) {
    	System.out.println("Actual balance is " + account.getBalance());
        account.deposit(amount);
    }
 
    @When("^He withdraws (\\d+) EUR from his account$")
    public void withdraw(int amount) {
        account.withdraw(amount);
        System.out.println("Balance after withdraw operation " + account.getBalance());
    }
 
    @Then("^The new balance is (\\d+) EUR$")
    public void verifyBalance(int balance) {
        Assert.assertThat(balance, is(account.getBalance()));
    }
}