
public class oms {
     public static void main(String[] args) {
		order obj1=new order();
		obj1.details("biriyani", "chennai");
	}
}
public class order() {
	 void details(String order,String location) {
	System.out.println(order + location);
	}
}