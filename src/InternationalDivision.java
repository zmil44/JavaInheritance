/*
 *	Zachary Miller
 *	assignment 7.1
 *  7/25/2018
 *  Bellevue University
 *  This program provides the code that will allow a display and creation of instances of this subclass 
 */
public class InternationalDivision extends Division {
	private String country;
	private String language;
	public InternationalDivision(String accountName, String accountNumber,String country,String lan)
	{
	super(accountName,accountNumber);
	this.country = country;
	this.language = lan;
	}
	public void display()
	{
	System.out.println( " The name of company is " + name);
	System.out.println( " The account number of company is " + accountNumber);
	System.out.println( " The company is located in " + country);
	System.out.println( " The language spoken in "+country+" is " + language);
	}
}
