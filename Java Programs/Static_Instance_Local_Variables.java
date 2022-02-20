package java_training;

public class Static_Instance_Local_Variables {
static int staticvariable=25;
int instancevariable=30;
	public static void main(String[] args) {
		int localvariable=10;
		
		Static_Instance_Local_Variables obj1=new Static_Instance_Local_Variables();
		System.out.println(obj1.instancevariable);
		System.out.println(Static_Instance_Local_Variables.staticvariable);
		System.out.println(localvariable);
	}

}
