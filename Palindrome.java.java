/*Program: To check whether the number is palindrome or not 
@author Payal
Date 18 Aug 
 */

class Palindrome
{
public static void main(String args[])
{
	int r,sum=0,temp,p=9867; //No. to be checked
	temp=p;
	while(p>0)
	{
		r=p%10; // remainder
		sum=(sum*10)+r;
		p=p/10;
	}
	if(temp==sum)
		System.out.println("Palindrome number");
	else
		System.out.println("not palindrome");

}
}