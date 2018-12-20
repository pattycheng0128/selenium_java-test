package ArrayDemo;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//List保證有序的
		List<String> list=new ArrayList<String>();
		list.add("A");
		list.add("D");
		list.add("C");
		list.add("B");
		System.out.println("ArrayList"+list);
		
		//底下3種set的差異
		//HashSet不保證存和取的順序一樣
		Set<String> set = new HashSet<String>();
		set.add("A");
		set.add("D");
		set.add("C");
		set.add("B");
		System.out.println("HashSet"+set);
		
		//LinkedHashSet保證存和取的順序一樣
		Set<String> Lset=new LinkedHashSet<String>();
		Lset.add("A");
		Lset.add("D");
		Lset.add("C");
		Lset.add("B");
		System.out.println("LinkedHashSet"+Lset);
		
		//依字母排序
		Set<String> Tset=new TreeSet<String>();
		Tset.add("A");
		Tset.add("D");
		Tset.add("C");
		Tset.add("B");
		System.out.println("TreeSet"+Tset);
		
		

	}

}
