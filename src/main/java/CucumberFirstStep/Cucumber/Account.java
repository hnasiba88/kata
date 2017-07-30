package CucumberFirstStep.Cucumber;

public class Account {

	private Personne personne;

	private int balance=0;

	public Personne getPersonne() {
		return personne;
	}
	
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public Account(Personne personne){
		this.personne = personne;
	}

	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int amount) {
		this.balance = this.balance-amount;		
	}

	public void deposit(int amount) {
		this.balance = this.balance+amount;
	}
}