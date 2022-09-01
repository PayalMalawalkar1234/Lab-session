/*Create a class named 'Rectangle' with two data members- length and breadth and a function to calculate the area which is 'length*breadth'. The class has three constructors which are :

1 - having no parameter - values of both length and breadth are assigned zero.		
2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.		
3 - having one number as parameter - both length and breadth are assigned that number.		
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.
*/
class Rectangle
{
    int length;
    int breadth;

    public Rectangle()
    {
        int length = 0;
        int breadth = 0;

    }

    void Rectanle(int lenght)
    {
	//this(12,13);
        this.length = 12 ;
         breadth = 13;

    }
    void rectangle(int length,int breadth)
    {
        this.length = 5;
        this.breadth = 6;
    }
    public void  Area()
    {
        System.out.println(length*breadth);
    }
}
public class Recatangle
 {
    public static void main(String[] args) 
	{
        Rectangle obj = new Rectangle();
        obj.Area();
        Rectangle obj1= new Rectangle(10);
        obj1.Area();
        Rectangle obj2 = new Rectangle(12,2);
        obj2.Area();


    }
}