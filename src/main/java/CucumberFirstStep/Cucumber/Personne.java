package CucumberFirstStep.Cucumber;

public class Personne {
	

	public String name;

	public Account userAccount;
	
	public Personne(String name){
		this.name = name;
	}

	public Account getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(Account userAccount) {
		this.userAccount = userAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
