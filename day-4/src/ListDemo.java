import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class ListDemo {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	list.add(1);
	list.add(3);
	list.add(4);
	//list.remove(2);
	System.out.println(list);
	list.sort(new Comparator<List>());
	
}
}
