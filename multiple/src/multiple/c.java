package multiple;

public class c implements B,A{
public static void main(String[] args) {
	c obj=new c();
	obj.print();
}
public void print() {
	System.out.println("hello");
}
}
