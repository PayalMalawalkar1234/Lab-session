/* 
Program: Simple Interest
date:6 Sept 2022
@author Payal
*/

class SimpleInterest
{
	//calling main
	public static void main(String args[])
	{
		float P=Float.parseFloat(args[0]);
		float N=Float.parseFloat(args[1]);
		float R=Float.parseFloat(args[2]);
		
		float SimpleInterest=(P*N*R)/2;
		System.out.println("The Simple Interest is :"+SimpleInterest);
	}
	//end of main
	
}// end of class