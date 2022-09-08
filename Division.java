/*Program: Java prog to find quotient and remainder(Take input)
date:8 Sept 2022
@author Payal
*/

class Division
{
	public static void main(String args[])
	{
		int dividend = Integer.parseInt(args[0]);
		int divisor = Integer.parseInt(args[1]);
		
		int quotient = dividend / divisor;
        int remainder = dividend % divisor;
		
		 System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);
	}
}