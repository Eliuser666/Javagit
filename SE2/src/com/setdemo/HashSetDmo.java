package com.setdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashSet<String> hs=new HashSet<String>();
		Set<String> set=new HashSet<String>();
		set.add("hello");
		set.add("world");
		set.add("java");
		/*Iterator<String> it=set.iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
		}*/
		for(String s:set){
			System.out.println(s);
		}
	}

}
