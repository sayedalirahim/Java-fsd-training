package java_training;

class Person
{  
void nationality(){
System.out.println("Indian");}  
}  
class Emp extends Person
{  
	void organization()
{
System.out.println("UST");
}  
}  
class Manager extends Emp
{  
	void place()
{
System.out.println("New York");
}  
}  
class Multilevelinheritance
{  
public static void main(String args[])
{  
	Manager m=new Manager();
	m.nationality();
	m.organization();m.place(); }
}

