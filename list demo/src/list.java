import java.util.LinkedList;
import java.util.List;
public class list {
public static void main(String[] args) {
	List<String> names=new LinkedList<String>();
	for(int i=0;i<500;i++) {
		names.add("Ram"+i);
		
	}
	System.out.println(names);
}
}
