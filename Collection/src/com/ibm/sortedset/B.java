package com.ibm.sortedset;
import java.util.Map;
import java.util.TreeMap;
public class B {
	public static void main(String[] args) {
		Map<String,String> accounts=new TreeMap<String,String>();
		accounts.put("1", "Account1");
		accounts.put("2","Account2");
		System.out.println(accounts);
		
	}

}
