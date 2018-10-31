/*
 *	Zachary Miller
 *	assignment 7.1
 *  7/25/2018
 *  Bellevue University
 *  This program creates 2 instances each of InternationalDivision class and the DomesticDivision class 
 */
public class UseDivision {
	public static void main(String[] args)
	{
	InternationalDivision international1 = new InternationalDivision("Toyota","49785556421","Japan","Japanese");
	international1.display();
	System.out.println();
	InternationalDivision international2 = new InternationalDivision("Volkeswagon","46852213545","Germany","German");
	international2.display();
	System.out.println();
	DomesticDivision domestic1 = new DomesticDivision("Ralco","99879456412","Minnesota");
	domestic1.display();
	System.out.println();
	DomesticDivision domestic2 = new DomesticDivision("Blizzard Entertainment","164524621","California");
	domestic2.display();
	}
}
