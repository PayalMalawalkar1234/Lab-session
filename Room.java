/* Write a program to create a room class, the attributes of this class is roomno, roomtype, roomarea and ACmachine. 
In this class the member functions are setdata and displaydata.	
By Payal
Date 1 Sept 2022*/
	
	class Room
	{
		private int roomNumber;
		private String roomType;
		private double roomArea;
		private boolean acMachine;
		
	
		void RoomData(int rNumber, rType, double rArea, boolean ac)
       {
		roomNumber=rNumber;
		roomType=rType;
		roomArea=rArea;
		acMachine=ac;
	   }
	void printRoom()
	{
		if(acMachine)
		System.out.println("Room Number is :"+RoomNumber );
		System.out.println("Room Type is :"+RoomType );
		System.out.println("Room Area is :"+RoomArea );
		System.out.println("There's an AC room");
		else
		{
			System.out.println("Non Ac room is available");
		}
		
	}
	void setDetails(int r_N, String r_Type, double r_Area, boolean ac_Nonac )
	{
		roomNumber= r_N;
		roomType= r_Type;
		roomArea= r_Area;
		acMachine= ac_Nonac;
	}
	}