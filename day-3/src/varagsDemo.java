
public class varagsDemo {
public static void main(String[] args) {
	Friend ob=new Friend();
	ob.fun(100);
	
}
}
class Friend{
	 void fun(int ...a) {
		System.out.println("number of arguments is"  +a.length);
		for(int i:a)
		System.out.println("The argument is"+i);
	}
}