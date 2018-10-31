/*
 *	Zachary Miller
 *	assignment 7.1
 *  7/25/2018
 *  Bellevue University
 *  This program provides the code that will allow a display and creation of instances of this subclass 
 */
public class DomesticDivision extends Division {
	private String state;
	public DomesticDivision(String accountName, String accountNum,String stateLocated)
	{
	super(accountName,accountNum);
	state = stateLocated;
	}
	public void display()
	{
	System.out.println( " The name of company is " + name);
	System.out.println( " the account number of company is " + accountNumber);
	System.out.println( " company is located in the state of " + state);

	}
}
