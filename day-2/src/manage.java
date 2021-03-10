
public class manage {
public static void main(String[] args) {
	details ob1=new details();
	ob1.details("biriyani","chennai");
	ob1.details("dosa","kerala");
	ob1.details("ildy", "delhi");
	ob1.details("pizza","bangalore");
    ob1.details("burger", "america");
    ob1.details("chappati","mumbai");
    ob1.details("pasta", "germany");
    ob1.details("noodles","china");
    ob1.details("Fish", "japan");
    ob1.details("chicken","germany");
    
}
}
class details{
	public void details(String order,String location) {
		System.out.println(order +"\t"+ location);
	}
}