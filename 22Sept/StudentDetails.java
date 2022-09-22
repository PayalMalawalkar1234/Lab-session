/* Write a Student and create an array of 10 students and display the students whose marks are more than 90%.
@Author : Payal Malawalkar
date 22 Sept 2022	*/

class Student
{
	//instance variable
 private int id;
 private String name;
 private float marks;
 private String course;
 
 
 
 
 Student() // no argument constructor
 {
	
 }
 // constructor overloading: Polymorphism
  Student(int id,String name,float marks,String course) // parameterized constructor
  {
	  System.out.println("----  Paramaterized  constructor1----");
	  this.id=id;
	  this.name=name;
	  this.marks=marks;
	  this.course= course;
  }
  
  Student(int id,String name,float marks) // parameterized constructor
  {
	  System.out.println("----  Paramaterized  constructor2----");
	  this.id=id;
	  this.name=name;
	  this.marks=marks;
	  this.course= "BCA";
  }
  
  //copy constructor
  Student(Student s)
  {
	  System.out.println("----  Copy constructor----");
	  this.id=s.id;
	  this.name=s.name;
	  this.marks=s.marks;
	  this.course=s.course;
  }
  // to change the value of course
   void setCourse(String course)
   {
	   this.course=course;
   }
 
 void display()
 {
   //String course; local variable is not initialized 
   System.out.println("--------------------");
  System.out.println("ID:"+id);
  System.out.println("Name:"+name);
    System.out.println("Marks:"+marks);
	 System.out.println("Course:"+course);
  }
 
 class  Student
 {
 public static void main(String ...args)
 {
 // creating array of 5 students
     Student[] std=new Student[5];
		
		// Constructor injection assingning
		std[0]=new Student(1,"jack",100);
		std[1]=new Student(2,"Ram",95);
		std[2]=new Student(3,"om",70);
		
		// getter setter injection
		std[3]=new Student();
		std[3].setStdId(67);
		std[3].setStdName("Rishi");
		std[3].setStdPercentage(70);
		
		// getter setter injection
		std[4]=new Student();
		std[4].setStdId(45);
		std[4].setStdName("Ram");
		std[4].setStdPercentage(90);
		
		 
		for(int i=0;i<std.length;i++)
		{
			
			float per=std[i].getStdPercentage();
			// percentage greater than 90
			if(per>=90) 
			{		
				// print student details
				System.out.println("\n------------ STUDENT "+i+" DETAILS -----------");
				System.out.println("The student id is : "+std[i].getStdId());
				System.out.println("The student name is : "+std[i].getStdName());
				System.out.println("The student percentage is : "+std[i].getStdPercentage());
			}// if ends
			
		}// for ends
		
	}// main method ends

 	
}// School class ends
	
}