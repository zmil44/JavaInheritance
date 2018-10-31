/*
 *	Zachary Miller
 *	assignment 7.1
 *  7/25/2018
 *  Bellevue University
 *  this is the super class of the Division classes. This only holds name and account number and lets the other classes
 *  hold what they specifically need and displays how inheritance works
 */
public abstract class Division {
	protected String name;
	protected String accountNumber;
	public Division(String accountName, String accountNum)
	{
		name = accountName;
		accountNumber = accountNum;
	}
	
	public abstract void display();
}
