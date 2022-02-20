package java_training;


	 class Report1 { 
		void subject() { 
	
	
	System.out.println("subject is maths");
	
	}
	
	void teacher()
	
	{
	
	System.out.println("Riya is taking maths");
	
	}
	
	}
	
	class Report2 extends Report1
	
	{
	
	void subject()
	
	{
	
	System.out.println("subject is english");
	
	}
	
	void teacher()
	
	{
	
	System.out.println("raam is taking english");
	
	}
	
	}
	
	class Attendance1
	
	{
	
	void absence()
	
	{
	
	System.out.println("2 are absent");
	
	}
	
	void present()
	
	{
	
	System.out.println("30 are present");
	
	}
	
	}
	
	class Attendance2 extends Attendance1
	
	{
	
	void absence()
	
	{
	
	System.out.println("3 are absent");
	
	}
	
	void present()
	
	{
	
	System.out.println("27 are present");
	
	}
	
	}
	
	 class Assgnmnt2two
	
	{
	
	public static void main(String[] args)
	
	{
	
	Report1 a=new Report2();
	
	Attendance1 b=new Attendance2();
	
	a.subject();
	
	a.teacher();
	
	b.absence();
	
	b.present();
	
	
	
	}
	
	}
