import java.util.*;
import java.util.stream.*;
public class ArrayAccount {
	public static void main(String[] args) {
		String Account[]= {"abc-10,000","bca-20,000"};
		System.out.println("Array:"+Account.toString());
		List<String> list=convertArrayToList(Account);
		System.out.println("list"+list);
		
	}

	}
public class New{
	public static <T> List<T>convertArrayToList(T[] account){
		List<T> list=new ArrayList<>();
		for(T t:account) {
			list.add(t);
		}
		return list;
	}
}
